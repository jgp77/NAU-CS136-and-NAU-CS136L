import javax.swing.JFrame;

public class StarViewer
{
  public static void main(String[] args)
  {
    JFrame frame=new JFrame("Stars");

    frame.setSize(1000,1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    StarComponent component =new StarComponent();
    frame.add(component);
    frame.setVisible(true);
  }
}
