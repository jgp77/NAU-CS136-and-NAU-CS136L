import java.awt.*;
import javax.swing.JComponent;

public class StarComponent extends JComponent
{
  public void paintComponent(Graphics g)
  {
    Graphics2D g2=(Graphics2D) g;
    Star star1=new Star(0,0);
    Star star2=new Star(500,500);
    Star star3=new Star(0,750);
    star1.draw(g2);
    star2.draw(g2);
    star3.draw(g2);
  }
}
