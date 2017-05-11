import javax.swing.JFrame;

public class CarViewer
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Custom Cars");
    // Creates a JFrame
    frame.setSize(300,400);
    // Sets size of JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CarComponent component =new CarComponent();
    // Creates the Car Components
    frame.add(component);
    // Adds components to the frame
    frame.setVisible(true);
    // Makes JFrame visible
  }
}
