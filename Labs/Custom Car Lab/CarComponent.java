import java.awt.*;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class CarComponent extends JComponent
{
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;
    PaintBucket bucket=new PaintBucket();
    // Creates a Graphics2D object and a Bucket object
    bucket.addColor(0,0,255);
    // Makes the color Blue
    g2.setColor(bucket.getColor());
    // Sets the color to the created color
    Car car1 = new Car(0,0,20,10,75);
    car1.draw(g2);
    // Creates car object and draws car object
    bucket.addColor(255,0,2);
    // Adds to to color
    g2.setColor(bucket.getColor());
    // Sets g2 to the new color
    Car car2 = new Car(0,100,5,5,50);
    car2.draw(g2);
    // Creates car object and draws car object
    bucket.addColor(2,255,255);
    // Adds to to color
    g2.setColor(bucket.getColor());
    // Sets g2 to the new color
    Car car3 = new Car(0,200,25,25,150);
    car3.draw(g2);
    // Creates car object and draws car object
  }
}
