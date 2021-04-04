package Beyond.Logic;

import java.io.FileReader;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

//        ConfigParser config = new ConfigParser("/Users/decagon/Desktop/Java/week-2-task-Beyond-Logic/src/Beyond/Logic/config.txt");

            //File Reader linking to the config.txt file.
            try(FileReader reader = new FileReader("/Users/decagon/Desktop/Java/week-2-task-Beyond-Logic/src/Beyond/Logic/config.txt")){
                Properties properties = new Properties();
                properties.load(reader);

                //Fields Linking
                String dbname = properties.getProperty("dbname");
                String host = properties.getProperty("host");
                String name = properties.getProperty("name");
                String port = properties.getProperty("port");
                String contextUrl = properties.getProperty("context-url");
                String mode = properties.getProperty("mode");
                String theme = properties.getProperty("theme");
                String pipeline = properties.getProperty("pipeline");
                String name2 = properties.getProperty("name");

                //Print to console
                System.out.println(dbname);
                System.out.println(host);
                System.out.println(name);
                System.out.println(port);
                System.out.println(contextUrl);
                System.out.println(mode);
                System.out.println(theme);
                System.out.println(pipeline);
                System.out.println(name2);



            } catch (Exception e) {
                System.out.println("Error not found!");
                e.printStackTrace();
            }
    }
}

