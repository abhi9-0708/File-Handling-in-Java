import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writeuserinput {
    public static void main(String[] args) {
        try{
            String name=new String();
            FileWriter myWriter=new FileWriter("file3.txt");
            Scanner sc =new Scanner(System.in);
            System.out.println("enter your name");
            name=sc.nextLine();
            myWriter.write("Your name is:"+name);
            myWriter.close();
            System.out.println("file created successfully");
        }
        catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}
