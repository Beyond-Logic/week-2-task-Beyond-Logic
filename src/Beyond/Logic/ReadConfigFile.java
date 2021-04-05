package Beyond.Logic;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadConfigFile {
    public static HashMap<String, String> readFile(String filename) {
        HashMap<String, String> data = new HashMap<String, String>();
        try {
            Scanner in = new Scanner(new File(filename));
            String line;
            while(in.hasNext()) {
                line = in.nextLine();
                String[] keyValue = line.split(":");
                keyValue[1] = keyValue[1].trim();
                data.put(keyValue[0], keyValue[1]);
            }
            in.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public String getDbname() {
        HashMap<String, String> datafile = readFile("/Users/decagon/Desktop/Java/week-2-task-Beyond-Logic/src/Beyond/Logic/config.txt");
        return datafile.get("dbname");
    }

}