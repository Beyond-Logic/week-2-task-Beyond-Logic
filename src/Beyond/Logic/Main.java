package Beyond.Logic;
import java.util.HashMap;

public class Main  extends ReadConfigFile {

    public static void main(String[] args) {
        System.out.println("Read File App");
    }
    public String getDbname() {
        HashMap<String, String> datafile = readFile("/Users/decagon/Desktop/Java/week-2-task-Beyond-Logic/src/Beyond/Logic/config.txt");
        System.out.println(datafile);
        return datafile.get("dbname");
    }
}