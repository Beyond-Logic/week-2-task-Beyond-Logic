package Beyond.Logic;
import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Environment {
    public static void main(String[] args)  {
        String fileName = " ";
        System.out.println("Welcome To Your Portal");
        Scanner environmentName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please Enter Environment");
        String environment = environmentName.nextLine();  // Read user input

        // If else statement to locates the config files

        if(environment.equalsIgnoreCase("production")) {
            fileName = "src/Beyond/Logic/config.txt";
        }
        else if(environment.equalsIgnoreCase("development")) {
            fileName = "src/Beyond/Logic/config.txt.dev";
        } else if(environment.equalsIgnoreCase("staging")){
            fileName = "src/Beyond/Logic/config.txt.staging";
        } else {
            System.out.println("Environment not found, Try again");
        }

        //HasMap & Buffered Reader to access a config file base on the if else statement
            String[]list = new String[]{};
            Map<String, String> keyMap = new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String keys;
            while ((keys=reader.readLine())!= null) {
                if(keys.contains("=")){
                    list = keys.split("=");
                }

                if (list.length > 1) {
                    System.out.println(keys);
                    if(list[0].equals("name")){
                        list[0] = "application."+list[0];
                    }
                    if(list[0].equals("port")){
                        list[0] = "application."+list[0];
                    }

                    if(list[0].equals("context-url")){
                        list[0] = "application."+list[0];
                    }
                    keyMap.putIfAbsent(list[0], list[1]);
                }


            }

            Scanner inputKey = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please enter Key Name for " + environment + " To retrieve Key Value");
            String outputKey = inputKey.nextLine().toLowerCase(Locale.ROOT);  // Read user input

            if (outputKey.equals(outputKey)) {
                System.out.println("value is: " + keyMap.get(outputKey));
            }


        }     catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Thank you for using my application");

        }
}





