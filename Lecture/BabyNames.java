/**
 * Creates a new object named BabyNames.
 * Takes in a file named "babynames.txt" and creates
 * two new files called "boynames.txt" and "girlnames.txt"
 *
 * @param  fileRead Scanner to read from the file "babynames.txt"
 * @param  girlNames ArrayList to store the girl names inside of
 * @param  boyNames ArrayList to store the boy names inside of
 * @return  Returns 2 new files "boynames.txt" and "girlnames.txt"
 */




import java.io.*;
import java.util.*;

public class BabyNames
{
public static void main(String[] args) throws IOException
{
        File babyFile=new File("babynames.txt");
        // Creates the file within Java
        Scanner fileRead=new Scanner(babyFile);
        // Creates a scanner to read the babynames file
        ArrayList<String> girlNames=new ArrayList<String>();
        // Creates a String ArrayList to store female names
        ArrayList<String> boyNames=new ArrayList<String>();
        // Creates a String ArrayList to store male names
        while (fileRead.hasNext())
        // While the file has data
        {
                int number=fileRead.nextInt();
                // Reads the line number that begins each line
                String tmpBoyName=fileRead.next();
                // Reads the male name in the line
                int intNum=fileRead.nextInt();
                // reads the first number
                double doubNum=fileRead.nextDouble();
                // reads the second number
                String tmpGirlName=fileRead.next();
                intNum=fileRead.nextInt();
                // reads the 3rd num
                doubNum=fileRead.nextDouble();
                // reads the 4th num
                girlNames.add(tmpGirlName);
                boyNames.add(tmpBoyName);
                // Adds the read name to the ArrayList
        }
        writeNames(boyNames,"boynames.txt");
        writeNames(girlNames,"girlnames.txt");
        // Calls upon WriteNames
        fileRead.close();
        // Closes the original file
}

public static void writeNames(ArrayList<String> nameArray,String filename) throws IOException
{
        File outputFile=new File(filename);
        FileWriter fw=new FileWriter(outputFile);
        // Creates a FileWriter to write to the new file
        for(String names:nameArray)
        // For names within nameArray
        {
                fw.write(names+System.getProperty("line.separator"));
                // Writes the string to the file and then writes a '\n' to the file
        }
        fw.close();
        // Closes the newly created file
}
}
