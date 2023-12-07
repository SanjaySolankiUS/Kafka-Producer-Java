package Configs;

import java.util.Properties;

public class Configurations {
    //private static final Logger logs = LogManager.getLogManager();
    public static void main(String[] args) {
        var prop = new Properties();
        prop.put("appID", "HelloKafkaProcedure");
        prop.put("bootstrapServer", "localhost:9092,localhost:9093");
        prop.put("topicName", "Install");
        prop.put("messagesCount", 1000000);
    }
}
