package Beyond.Logic;
import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;


public class ReadConfigFileToHashMap {
    public static void main(String[] args) throws IOException {
//        HashMap<String, String> config = new HashMap<String, String>();

        Scanner fileName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please Enter Environment");
        String environment = fileName.nextLine();  // Read user input

        if(environment.equalsIgnoreCase("production")) {
        try(FileReader reader = new FileReader("src/Beyond/Logic/config.txt")) {
            Properties properties = new Properties();
            properties.load(reader);
            //
            String dbname = properties.getProperty("dbname");
            String host = properties.getProperty("host");
            String applicationName = properties.getProperty("name");
            String port = properties.getProperty("port");
            String contextUrl = properties.getProperty("context-url");
            String mode = properties.getProperty("mode");
            String theme = properties.getProperty("theme");
            String pipeline = properties.getProperty("pipeline");
            String applicationName1 = properties.getProperty("name");

            System.out.println(dbname);
            System.out.println(host);
            System.out.println(applicationName);
            System.out.println(port);
            System.out.println(contextUrl);
            System.out.println(mode);
            System.out.println(theme);
            System.out.println(pipeline);
            System.out.println(applicationName1);



            //
        }     catch (Exception e) {
            e.printStackTrace();
        }
        }

        else if (environment.equalsIgnoreCase("development")) {
            try (FileReader reader = new FileReader("src/Beyond/Logic/config.txt.dev")) {
                Properties properties = new Properties();
                properties.load(reader);


                //
                String dbname = properties.getProperty("dbname");
                String host = properties.getProperty("host");
                String applicationName = properties.getProperty("name");
                String port = properties.getProperty("port");
                String contextUrl = properties.getProperty("context-url");
                String mode = properties.getProperty("mode");
                String theme = properties.getProperty("theme");
                String pipeline = properties.getProperty("pipeline");
                String applicationName1 = properties.getProperty("name");

                System.out.println(dbname);
                System.out.println(host);
                System.out.println(applicationName);
                System.out.println(port);
                System.out.println(contextUrl);
                System.out.println(mode);
                System.out.println(theme);
                System.out.println(pipeline);
                System.out.println(applicationName1);

                //


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
                else if (environment.equalsIgnoreCase("staging")){
            try (FileReader reader = new FileReader("src/Beyond/Logic/config.txt.staging")) {
                Properties properties = new Properties();
                properties.load(reader);
                //
                String dbname = properties.getProperty("dbname");
                String host = properties.getProperty("host");
                String applicationName = properties.getProperty("name");
                String port = properties.getProperty("port");
                String contextUrl = properties.getProperty("context-url");
                String mode = properties.getProperty("mode");
                String theme = properties.getProperty("theme");
                String pipeline = properties.getProperty("pipeline");
                String applicationName1 = properties.getProperty("name");

                System.out.println(dbname);
                System.out.println(host);
                System.out.println(applicationName);
                System.out.println(port);
                System.out.println(contextUrl);
                System.out.println(mode);
                System.out.println(theme);
                System.out.println(pipeline);
                System.out.println(applicationName1);
                //


            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Environment not found, Try again");
        }





        }

        }


