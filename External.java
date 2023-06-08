
import java.io.*;
import java.util.ArrayList;

public class External{

    public static boolean createFile(String username, String filename) throws Exception{
        Process p;
        //File dir = new File(System.getProperty("user.dir"));

        try {
            String regex = "^[a-zA-Z0-9_-]*$";
            if(username.matches(regex) && filename.matches(regex)){
                File dir=new File(System.getProperty("user.dir")+"/"+username+"/"+filename);
                return dir.createNewFile();
            }else{
                return false;
            }
            // p = Runtime.getRuntime().exec(new String[] { "bash", "-c", "touch tmp/" + username + "/" + filename}, null, dir);

            //p.waitFor();
            //return true;
        } catch(Exception e) {
            throw e;
        }
    }
}
