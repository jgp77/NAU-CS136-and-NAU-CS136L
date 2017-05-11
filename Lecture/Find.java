import java.io.*;
import java.util.*;

/**
* Takes in a string to look for (args[0]), and file names.
* It will print out if no arguements are passed in, or
* if the inputted file names are invalid.
*
* @param args[] arguements given when executed
* @param fileRead Scanner of file names passed in
* @param lineRead reading of lines in fileRead
* @return Print statment of file contents if it contains
* a given string (args[0])
*/

public class Find
{
public static void main(String[] args) throws FileNotFoundException
{
        if (args.length!=0)
        // Checks if there were any args passed in
        {
                for (int i=1;i!=args.length;i++)
                {
                        try
                        {
                                Scanner fileRead=new Scanner(new File(args[i]));
                                // Creates a scanner for the ith arg
                                System.out.println(args[i]+":");
                                // Prints out filename
                                while(fileRead.hasNext())
                                // While file has more
                                {
                                        String lineRead=fileRead.nextLine();
                                        // Reads the next line
                                        if(lineRead.contains(args[0]))
                                        // If line contains first argument
                                        {
                                                System.out.println("    "+lineRead);
                                                // Prints spacing and the line
                                        }
                                }
                                fileRead.close();
                                // Closes file
                        }
                        catch(FileNotFoundException e)
                        {
                                System.out.println(args[i]+" is an invalid file.");
                                // If file is not found, informs user
                        }
                }
        }
        else
        {
                System.out.println("No arguements passed in.");
                // If not args passed in, informs user
        }
}
}
