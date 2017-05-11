import java.util.Scanner;
import java.io.*;
public class LightsOutFileLoader
{
	private Scanner fileRead;
	// Scanner to read a file
	private String fileLines;
	// String to store file contents
	private Character fileChar;
	// Character for use of setting the board state

public void load(LightsOut game, File inputfile) throws UnsupportedLightsOutFileException,FileNotFoundException
{
        fileRead=new Scanner(inputfile);
        // Creates a new scanner on the input file
        fileLines=fileRead.next();
        // Reads the first line of the file and sets it to the string
        for(int i=0; i<fileLines.length(); i++)
        {
                for(int j=0; j!=fileLines.length(); j++)
                // Creates a nested loop
                {
                        fileChar=fileLines.charAt(j);
                        // Sets the char to the char at pos j
                        if(fileChar.equals('X'))
                        // If the char is 'X'
                        {
                                game.forceLit(i,j,false);
                                // Sets the pos to false
                        }
                        else if(fileChar.equals('_'))
                        // Else if the char is '_' sets to true
                        {
                                game.forceLit(i,j,true);
                        }
                        else
                        // else throws an exception
                        {
                                throw new UnsupportedLightsOutFileException();
                        }
                }
                if(i!=fileLines.length()-1)
                // Checks if at end of file
                {
                        fileLines=fileRead.next();
                        // Moves on to next line
                }
        }
        fileRead.close();
        // Closes file
}
}
