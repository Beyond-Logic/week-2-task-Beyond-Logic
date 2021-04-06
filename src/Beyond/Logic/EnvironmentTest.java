package Beyond.Logic;
import org.junit.jupiter.api.Test;
import java.io.File;

class EnvironmentTest extends Environment {

   @Test
    public void TestEnvironmentFile() {

       File fileProduction = new File("src/Beyond/Logic/config.txt");
       File fileDevelopment = new File("src/Beyond/Logic/config.txt.dev");
       File fileStaging = new File("src/Beyond/Logic/config.txt.staging");
            if(fileProduction.isFile()) {
                System.out.println("This is the Production File");
            } else if (fileDevelopment.isFile()){
                System.out.println("This is the Development File");
            } else if (fileStaging.isFile()){
                System.out.println("This is the Staging File");
            }


   }

   @Test
   public void TestEnvironmentFileKey() {
       String keyName = "";
       if(keyName.equalsIgnoreCase("dbname")){
           System.out.println("There is that key");
       }
   }

}