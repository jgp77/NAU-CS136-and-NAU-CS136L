import java.awt.*;
import java.awt.geom.*;

public class Car
{
  private int xLeft;
  private int yTop;
  private int frontWheelSize;
  private int backWheelSize;
  private int carLength;
  private Color carColor;

  public Car(int x, int y, int frontTireSize,int rearTireSize, int carWidth,Color color)
  {
    xLeft = x;
    yTop = y;
    frontWheelSize=frontTireSize;
    backWheelSize=rearTireSize;
    carLength=carWidth;
    carColor=color;
  }

  public void draw(Graphics2D g2d)
  {
    Rectangle body = new Rectangle(xLeft, yTop+10, carLength, 10);
    Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft, yTop+20, frontWheelSize, frontWheelSize);
    Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft+(carLength-backWheelSize), yTop+20, backWheelSize, backWheelSize);
    Point2D.Double r1 = new Point2D.Double(xLeft+10, yTop+10);
    Point2D.Double r2= new Point2D.Double(xLeft+20,yTop);
    Point2D.Double r3= new Point2D.Double(xLeft+(carLength-20),yTop);
    Point2D.Double r4= new Point2D.Double(xLeft+(carLength-10),yTop+10);
    Line2D.Double frontWindshield=new Line2D.Double(r1,r2);
    Line2D.Double roofTop=new Line2D.Double(r2,r3);
    Line2D.Double rearWindshield=new Line2D.Double(r3,r4);
    g2d.setColor(carColor);
    g2d.draw(body);
    g2d.fill(body);
    g2d.draw(frontWindshield);
    g2d.draw(roofTop);
    g2d.draw(rearWindshield);
    g2d.setColor(Color.BLACK);
    g2d.draw(frontTire);
    g2d.draw(rearTire);
    g2d.fill(frontTire);
    g2d.fill(rearTire);
  }
}
