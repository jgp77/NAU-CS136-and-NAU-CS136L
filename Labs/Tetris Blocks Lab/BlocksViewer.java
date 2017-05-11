import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class BlocksViewer
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Tretris");
    // Creates a new JFrame with the title of Tretris
    frame.setSize(10*20, 27*20);
    // Sets size to 10 blocks wide by 28 blocks high. Each block is 20 units
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Sets default close operation to exit on close
    frame.setBackground(Color.GRAY);
    // Sets background to the color GRAY
    frame.setLocationRelativeTo(null);
    // Centers the frame on screen
    BlocksComponent component = new BlocksComponent();
    // Creates the componenets to add to the JFrame
    frame.add(component);
    // Adds the components to the JFrame
    frame.setVisible(true);
    // Makes the frame visible
  }
}
