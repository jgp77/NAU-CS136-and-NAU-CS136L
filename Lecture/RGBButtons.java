import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.*;

@SuppressWarnings("serial")// Needed to supress the warning

/**
* This program creates a JFrame from the RGBButtons class.
* The RGBButtons class creates multiple pannels to display
* buttons and a color. When a button is pressed, the frame changes
* to that colorPanel
*
* @return      A JFrame with JPanels that displays a color
*/

public class RGBButtons extends JFrame
{
  private JPanel colorPanel=new JPanel();; // Creates a panel that will contain the color
  private JPanel panel=new JPanel(new BorderLayout()); // Creates a panel to store the buttons in
  private JPanel buttons=createButtons(); // Creates a Panel containing the buttons


  public static void main(String[] args)
  {
    JFrame frame=new RGBButtons(); // Main function to display the JFrame
  }

  /**
  * Sets up the JPanels for the JFrame.
  * Also sets the size, visibility, and close
  *
  * @param       colorPanel  Panel that will change colors
  * @param       panel       Panel that will hold the buttons within it
  * @param       buttons     Panel that holds buttons in the center
  * @return      A JFrame with JPanels that displays a color
  */

  public RGBButtons()
  {
    add(panel,BorderLayout.SOUTH); // Adds the panel contianing buttons to the South of the JFrame
    add(colorPanel,BorderLayout.CENTER); // Puts the color frame into the center of the JFrame
    panel.add(buttons,BorderLayout.CENTER); // Adds the Buttons to the center of the panel
    setSize(500, 500); // Sets JFrame Size
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default close operation
    setVisible(true); //Visibility is true
  }

  /**
  * Method to create the buttons needed for the
  * button panel
  *
  * @param       buttons     Panel to be returned that holds buttons
  * @param       blueButton  JButton that will change the color to blue
  * @param       greenButton JButton that will change the color to green
  * @param       redButton   JButton that will change the color to red
  * @return      buttons, A panel that contains each button
  */

  private JPanel createButtons()
  {
    JPanel buttons=new JPanel(); // JPanel that will be returned
    JButton blueButton=new JButton("BLUE"); // Creates a Button with label
    blueButton.addActionListener(new ColorButtonClick(Color.BLUE)); // Adds a listener to the button
    JButton greenButton=new JButton("GREEN"); // Creates a Button with label
    greenButton.addActionListener(new ColorButtonClick(Color.GREEN)); // Adds a listener to the button
    JButton redButton=new JButton("RED"); // Creates a Button with label
    redButton.addActionListener(new ColorButtonClick(Color.RED)); // Adds a listener to the button
    buttons.add(blueButton); // Adds button to the panel to be returned
    buttons.add(greenButton); // Adds button to the panel to be returned
    buttons.add(redButton); // Adds button to the panel to be returned
    return buttons;
  }

  /**
  * Class that implements ActionListener. Each button will
  * Implement these listeners and will change the color to
  * specified color when pressed
  *
  * @param       color    Current color of the panel
  */

  class ColorButtonClick implements ActionListener
  {
    private Color color; // Color of the panel
    public ColorButtonClick(Color c)
    {
      color=c; // Sets button click to color
    }
    public void actionPerformed(ActionEvent action)
    {
      colorPanel.setBackground(color); // If button is pressed set to color
    }
  }
}
