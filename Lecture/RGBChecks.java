import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.*;

@SuppressWarnings("serial") // Needed to supress the warning

/**
 * This program creates a JFrame from the RGBChecks class.
 * The RGBChecks class creates multiple pannels to display
 * toggle buttons and a color. When a button is pressed, the frame changes
 * to that colorPanel. If multiple are pressed, the panel mixes
 * the two colors
 *
 * @return      A JFrame with JPanels that displays a color
 */

public class RGBChecks extends JFrame
{
  private JPanel colorPanel=new JPanel();; // Creates a panel that will contain the color
  private JPanel panel=new JPanel(new BorderLayout()); // Creates a panel to store the buttons in
  private JPanel buttons=createButtons(); // Creates a Panel containing the buttons
  private JCheckBox redCheck; // Check Box button
  private JCheckBox greenCheck; // Check Box button
  private JCheckBox blueCheck; // Check Box button
  private Color background; // background Color
  private float blue; // blue value
  private float green; // green value
  private float red; // red value
  
  public static void main(String[] args)
  {
    JFrame frame=new RGBChecks();// Main function to display the JFrame
  }

/**
* Sets up the JPanels for the JFrame.
* Also sets the size, visibility, and close
*
* @param       colorPanel  Panel that will change colors
* @return      A JFrame with JPanels that displays a color
*/

  public RGBChecks()
  {
    add(panel,BorderLayout.SOUTH); // Adds the panel contianing buttons to the South of the JFrame
    add(colorPanel,BorderLayout.CENTER); // Puts the color frame into the center of the JFrame
    panel.add(buttons,BorderLayout.CENTER); // Adds the Buttons to the center of the panel
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Close operation
    setSize(500, 500); // size setting
    setVisible(true); // Visibility true
  }


    /**
     * Method to create the buttons needed for the
     * checkBoxes panel
     *
     * @param       buttons     Panel to be returned that holds buttons
     * @param       blueCheckBox  JCheckBox that will change the color to blue
     * @param       greenCheckBox  JCheckBox that will change the color to green
     * @param       redCheckBox  JCheckBox that will change the color to red
     * @return      Adds the checkBoxes Panel to the JFrame
     */

  private JPanel createButtons()
  {
    JPanel checkBoxes=new JPanel(); // Creates the pannel that will contain the buttons
    blueCheck=new JCheckBox("BLUE"); // Creates a check button
    greenCheck=new JCheckBox("GREEN"); // Creates a check button
    redCheck=new JCheckBox("RER"); // Creates a check button
    blueCheck.addActionListener(new ColorButtonClick()); // Adds a listenet to the button
    greenCheck.addActionListener(new ColorButtonClick()); // Adds a listenet to the button
    redCheck.addActionListener(new ColorButtonClick()); // Adds a listenet to the button
    checkBoxes.add(blueCheck); // Adds button to checkBoxes panel
    checkBoxes.add(greenCheck); // Adds button to checkBoxes panel
    checkBoxes.add(redCheck); // Adds button to checkBoxes panel
    return checkBoxes;
  }

  /**
   * Class that implements ActionListener. Each button will
   * Implement these listeners and will change the color to
   * specified color when pressed. If multiple are pressed
   * the background will be changed based upon the mix.
   *
   * @return    colorPanel bacground is set to the new color
   */

  class ColorButtonClick implements ActionListener
  {
    public void actionPerformed(ActionEvent action)
    {
      if(blueCheck.isSelected()){blue=1;} // If blue is selected
      else{blue=0;} // Else blue is not selected
      if(greenCheck.isSelected()){green=1;} // If Green is selected
      else{green=0;} // Else green is not selected
      if (redCheck.isSelected()){red=1;} // If red is selcted
      else{red=0;} // Else red is not selected
      background=new Color(red, green, blue); // background is new mixture of colors
      colorPanel.setBackground(background); // Sets background color to new mix
    }
  }
}
