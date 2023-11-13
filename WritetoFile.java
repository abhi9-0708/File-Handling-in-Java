import java.io.FileWriter;
import java.io.IOException;
public class WritetoFile {
    public static void main(String[] args) {
        try{
            //creating an object named myWriter
            FileWriter myWriter=new FileWriter("file2.txt");
            //using write method to write 
            myWriter.write("Welcome to java file Handling");
            myWriter.close();
            System.out.println("FILE CREATED SUCCESSFULLY");
        }
        catch(IOException e){
             System.out.println("an error occured");
             e.printStackTrace();   
           }
    }
    
}
