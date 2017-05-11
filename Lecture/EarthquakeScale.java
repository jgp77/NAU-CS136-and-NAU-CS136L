import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
* This program creates a JFrame from the EarthquakeScale class.
* The class creates a panel with buttons that has a text field
* and will print various statements as given by the homework
* requirements. It was not required but if a number less than
* 0 is entered, the program will prompt the user so. This is Also
* used to catch if the user enters something other than a number
*
* @return      A JFrame with a JPanel that displays a textfield for user input
*/

@SuppressWarnings("serial")
public class EarthquakeScale
{
  private JFrame frame=new JFrame();
  // Creates a frame to hold everything
  private JPanel panel=new JPanel();
  // Creates a panel to store the items
  private JLabel label=new JLabel("Magnitude:");
  // Label for the text field
  private JTextField magnitude=new JTextField(5);
  // Text field for user input
  private JButton button=new JButton("Display");
  // Button to refresh response
  private JLabel description=new JLabel("Welcome to a Richter scale simulator.");
  // Label to display various respsnses

  /**
  * Set up for the JPanels for the JFrame.
  * Also sets the size, close op, and visibility
  *
  * @param       createFrame   Method that creates the nessesary componenets and sets up frame
  * @return      A JFrame with a JPanel that displays a textfield for user input
  */
  public EarthquakeScale()
  {
    createFrame();
    // Goes to createFrame
    frame.setSize(600,150);
    // Sets frame size
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Sets close op
    frame.setVisible(true);
    // Set visibility
  }
  /**
  * Creates the components, adds to a panel, and then adds to frame
  *
  * @param       label      Label for the magnitude textfield
  * @param       magnitude  Textfield for user input
  * @param       button     button to confirm textfield
  * @param       description Given description of each magnitude range
  * @return      None, adds components to frame
  */
  private void createFrame()
  {
    // Adding an ActionListener to the button
    button.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        try
        {
          // Tries to get magnitude
          double input=Double.parseDouble(magnitude.getText());
          if(input<0) {throw new NumberFormatException();}
          // If input is negative throw exception
          else if(input<=4.5)
          // Else if less than or equal to 4.5, display message
          {
            description.setText("Damage to poorly constructed buildings");
          }
          else if(input<=6)
          // Else if less than or equal to 6, display message
          {
          description.setText("Many buildings considerably damaged, some collapse");
          }
          else if(input<=7)
          // Else if less than or equal to 7, display message
          {
            description.setText("Many buildings destroyed");
          }
          else
          // else display message
          {
            description.setText("Most structures fall");
          }
        }
        // Catch any exceptions and inform the user
        catch(NumberFormatException event){description.setText("Invalid input! Must be a number and number cannot be <0.");}
        // Informs the user if the number inputted is not the correct input. I.E. not a number of less than 0
        finally{}
          // Empty finally as it is unneeded
        }
      });
    panel.setBackground(Color.WHITE);
    // Add items to panel
    panel.add(label);
    panel.add(magnitude);
    panel.add(button);
    panel.add(description);
    // Add panel to frame
    frame.add(panel);
  }

  public static void main(String[] args)
  {
    // Creates a new frame using EarthquakeScale
    EarthquakeScale frame=new EarthquakeScale();
  }
}
