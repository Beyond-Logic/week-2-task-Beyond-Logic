package Beyond.Logic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;


public class ReadConfigFileToHashMap {
    final static String filePath = "/Users/decagon/Desktop/Java/week-2-task-Beyond-Logic/src/Beyond/Logic/config.txt";
    public static void main(String[] args) {
        // read text file to HashMap
        Map<String, String> mapFromFile = getHashMapFromTextFile();
        // iterate over HashMap entries
        for(Map.Entry<String, String> entry : mapFromFile.entrySet()){
            System.out.println(entry.getKey());
        }
    }
    public static Map<String, String> getHashMapFromTextFile(){
        Map<String, String> mapFileContents = new LinkedHashMap<String, String>();
        BufferedReader br = null;

        try {
            //create file object
            File config = new File(filePath);

            //create Buffered Reader object from File
            br = new BufferedReader( new FileReader(config) );
            String line = null;

            //read config line by line
            while ( (line = br.readLine()) != null) {
                //split the line by:
                String[] parts = line.split(":");
                //first part is key, second is value
                String key = parts[0].trim();
                String value = parts[0].trim();

                //put key, value in Hashmap if they are not empty
                if(!key.equals("") && !value.equals(""))
                    mapFileContents.put(key,value);
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
