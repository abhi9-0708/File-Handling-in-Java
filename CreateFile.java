import java.io.File;

import java.io.IOException;
public class CreateFile{
    public static void main(String[] args) {
        try{
            //creating an object of file named myObj
            File myObj=new File("file1.txt");
            //using createNewFile()method to create  a file
            if(myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }
            else{
                System.out.println("file already exist");
            }
        }
        catch(IOException e){
                System.out.println("an error occured");
                e.printStackTrace();//show the line no where the problem occur
        }
    }
}

