package bsu.comp152;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileImport {
    public static void main(String[]Args)throws IOException{
        //read file names into a list
        // file should be in the project not the Src folder
        var fileName = "student.txt";
        String allNames = Files.readString(Paths.get(fileName));
        String[] nameList = allNames.split("\n");
        //printing the list
        System.out.println("The names of the students in your class are ");
        for (String Name: nameList){
            System.out.println(Name);
        }
    }
}
