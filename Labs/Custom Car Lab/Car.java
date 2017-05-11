import java.awt.*;
import java.awt.geom.*;

public class Car
{
  private int xLeft;
  private int yTop;
  private int FrontwheelSize;
  private int BackwheelSize;
  private int CarLength;
  // Creates various variables for future use
  public Car(int left, int top, int Frontwheel_diameter,int Backwheel_diameter, int length_car)
    {
      xLeft = left;
      yTop = top;
      FrontwheelSize=Frontwheel_diameter;
      BackwheelSize=Backwheel_diameter;
      CarLength=length_car;
      // Sets the car's length and wheel diameters to correct values
      // Moves car to correct starting location
    }

    public void draw(Graphics2D g2)
    {
      Rectangle body = new Rectangle(xLeft, yTop+10, CarLength, 10);
      // Creates the body with specified length
      Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft, yTop+20, FrontwheelSize, FrontwheelSize);
      Ellipse2D.Double rearTire = new Ellipse2D.Double(CarLength-(BackwheelSize), yTop+20, BackwheelSize, BackwheelSize);
      // Creates wheels with specified lengths
      Point2D.Double r1 = new Point2D.Double(xLeft+10, yTop+10);
      Point2D.Double r2= new Point2D.Double(xLeft+20,yTop);
      Point2D.Double r3= new Point2D.Double(CarLength-20,yTop);
      Point2D.Double r4= new Point2D.Double(CarLength-10,yTop+10);
      Line2D.Double frontWindshield=new Line2D.Double(r1,r2);
      Line2D.Double roofTop=new Line2D.Double(r2,r3);
      Line2D.Double rearWindshield=new Line2D.Double(r3,r4);
      // Creates the points and lines neccessary for drawing the roof
      g2.fill(body);
      g2.fill(frontTire);
      g2.fill(rearTire);
      // Fills in tires and body
      g2.draw(body);
      g2.draw(frontTire);
      g2.draw(rearTire);
      g2.draw(frontWindshield);
      g2.draw(roofTop);
      g2.draw(rearWindshield);
      // Draws all the required shapes
    }
}
