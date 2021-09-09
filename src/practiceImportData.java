import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class practiceImportData {

    public static void main(String[]Args)throws IOException {
        var dataFile = "dataPractice.txt";
        var allData = Files.readAllLines(Paths.get(dataFile));
        var Names = new ArrayList<String>();
        var Age = new ArrayList<Integer>();
        for(var line: allData){
            var splitData = line.split(",");
            Names.add(splitData[0]);
            Integer age = Integer.valueOf(splitData[1]);
            Age.add(age);
            //or Age.add(Integer.parseInt(splitData[1]));
        }
        for(int i = 0;i< Names.size();i++){
            System.out.println("Student "+Names.get(i)+ " is age "+ Age.get(i));
        }
    }
}

