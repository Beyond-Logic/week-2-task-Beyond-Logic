package Beyond.Logic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;


public class ReadConfigFileToHashMap {
    public static void main(String[] args) {
        String first = "src/Beyond/Logic/config.txt";
        String second = "src/Beyond/Logic/config.txt.dev";
        String third = "src/Beyond/Logic/config.txt.staging";

        // read
        // config.txt
        // config.txt.dev
        // config.txt.staging
        // files to HashMap

        Map<String, String> mapFromFirst = getHashMapFromConfig(first);
        Map<String, String> mapFromSecond = getHashMapFromConfigDev(second);
        Map<String, String> mapFromThird = getHashMapFromConfigStaging(third);

        // iterate over HashMap entries
        for(Map.Entry<String, String> entry : mapFromFirst.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        for(Map.Entry<String, String> entry : mapFromSecond.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        for(Map.Entry<String, String> entry : mapFromThird.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
    public static Map<String, String> getHashMapFromConfig(String filePath){
        Map<String, String> mapFileContents = new LinkedHashMap<String, String>();
        BufferedReader br = null;

        try {
            //create file object
            File config = new File(filePath);

            //create Buffered Reader object from File
            br = new BufferedReader( new FileReader(config) );
            String line;

            //read config line by line
            while ( (line = br.readLine()) != null) {
                //split the line by:
                String[] section = line.split("=");
                //first section is key, second is value
                String key = section[0].trim();
                String value = section[1].trim();

                //put key, value in Hashmap if they are not empty
                if(!key.equals("") && !value.equals(""))
                    mapFileContents.put(key, value);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //Always close the BufferedReader
            if(br != null){
                try {
                    br.close();
                } catch (Exception e){ };
            }

        } return mapFileContents;

    }

    public static Map<String, String> getHashMapFromConfigDev(String filePath){
        Map<String, String> mapFileContents = new LinkedHashMap<String, String>();
        BufferedReader br = null;

        try {
            //create file object
            File configdev = new File(filePath);

            //create Buffered Reader object from File
            br = new BufferedReader( new FileReader(configdev) );
            String line;

            //read configdev line by line
            while ( (line = br.readLine()) != null) {
                //split the line by:
                String[] section = line.split("=");
                //first section is key, second is value
                String key = section[0].trim();
                String value = section[1].trim();

                //put key, value in Hashmap if they are not empty
                if(!key.equals("") && !value.equals(""))
                    mapFileContents.put(key, value);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //Always close the BufferedReader
            if(br != null){
                try {
                    br.close();
                } catch (Exception e){ };
            }

        } return mapFileContents;

    }

    public static Map<String, String> getHashMapFromConfigStaging(String filePath){
        Map<String, String> mapFileContents = new LinkedHashMap<String, String>();
        BufferedReader br = null;

        try {
            //create file object
            File configstaging = new File(filePath);

            //create Buffered Reader object from File
            br = new BufferedReader( new FileReader(configstaging) );
            String line;

            //read configstaging line by line
            while ( (line = br.readLine()) != null) {
                //split the line by:
                String[] section = line.split("=");
                //first section is key, second is value
                String key = section[0].trim();
                String value = section[1].trim();

                //put key, value in Hashmap if they are not empty
                if(!key.equals("") && !value.equals(""))
                    mapFileContents.put(key, value);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //Always close the BufferedReader
            if(br != null){
                try {
                    br.close();
                } catch (Exception e){ };
            }

        } return mapFileContents;

    }
}