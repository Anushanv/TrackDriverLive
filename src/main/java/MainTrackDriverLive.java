import com.pickme.config.Config;

import com.pickme.dbhelper.DriverLiveCassandra;
import com.pickme.dbhelper.DriverLiveDatabase;
import com.pickme.dbhelper.DriverLiveIgnite;
import com.pickme.display_dashboard.Dashboard;
import com.pickme.drivertrack.consumers.DriverAndTripConsumer;
import org.apache.kafka.clients.consumer.*;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.ldap.PagedResultsControl;
import java.sql.SQLException;
import java.util.Properties;


public class MainTrackDriverLive {
    private static Properties props;
    private static String topicLogin;
    private static String topicShift;
    private static String topicDriver;
    private static String topicDriverLocationChanged;
    private static  String topicTrip;
    private static String topicVehicleAssign;
    private static String topicDHstatus;
    private  static Logger logger= LoggerFactory.getLogger(MainTrackDriverLive.class.getClass().getName());
    private static DriverLiveDatabase driverLiveDatabase1;
    private static DriverLiveDatabase driverLiveDatabase2;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        BasicConfigurator.configure();
        Config config=new Config();
        driverLiveDatabase1 = new DriverLiveCassandra(config);
        driverLiveDatabase2=new DriverLiveIgnite();

        Dashboard dashboard = new Dashboard();
        dashboard.run(driverLiveDatabase1);




        props = new Properties();

        props.put("enable.auto.commit", config.getProp().getProperty("AUTO_COMMIT"));
        props.put("auto.commit.interval.ms", config.getProp().getProperty("AUTO_COMMIT_INTERVAL"));
        props.put("session.timeout.ms", config.getProp().getProperty("SESSION_TIME_OUT"));

        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, config.getProp().getProperty("BOOTSTRAP_SERVERS_CONFIG"));
        props.put(ConsumerConfig.GROUP_ID_CONFIG, config.getProp().getProperty("GROUP_ID_CONFIG"));
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, config.getProp().getProperty("KEY_DESERIALIZER_CLASS_CONFIG"));
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, config.getProp().getProperty("VALUE_DESERIALIZER_CLASS_CONFIG"));
        props.put("schema.registry.url",config.getProp().getProperty("SCHEMA_URL"));
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,config.getProp().getProperty("AUTO_OFFSET_RESET_CONFIG"));


        topicLogin=config.getProp().getProperty("TOPIC_LOGIN");
        topicShift=config.getProp().getProperty("TOPIC_SHIFT");
        topicDriver=config.getProp().getProperty("TOPIC_DRIVER");
        topicDriverLocationChanged=config.getProp().getProperty("TOPIC_DRIVER_LOCATION_CHANGED");
        topicTrip=config.getProp().getProperty("TOPIC_TRIP");
        topicVehicleAssign=config.getProp().getProperty("TOPIC_DRIVER_VEHICLE");
        topicDHstatus=config.getProp().getProperty("TOPIC_DH_STATUS");







        DriverAndTripConsumer driverConsumer= new DriverAndTripConsumer(driverLiveDatabase1,driverLiveDatabase2,config,props, topicLogin,topicShift,topicDriver,topicDriverLocationChanged,topicTrip,topicVehicleAssign,topicDHstatus);

        driverConsumer.getdata();








    }


}
