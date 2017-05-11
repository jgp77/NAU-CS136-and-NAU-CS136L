import java.awt.*;
import java.awt.geom.*;


public class Star
{
    private int x_coord;
    private int y_coord;


    public Star(int x, int y)
    {
      x_coord=x;
      y_coord=y;
    }

    public void draw(Graphics2D g2)
    {
      Point2D.Double r1=new Point2D.Double(x_coord, y_coord);
      Point2D.Double r2= new Point2D.Double(x_coord+40,y_coord+40);
      Point2D.Double r3= new Point2D.Double(x_coord+20, y_coord);
      Point2D.Double r4= new Point2D.Double(x_coord+20, y_coord+40);
      Point2D.Double r5= new Point2D.Double(x_coord+40, y_coord);
      Point2D.Double r6= new Point2D.Double(x_coord, y_coord+40);
      Point2D.Double r7= new Point2D.Double(x_coord, y_coord+20);
      Point2D.Double r8= new Point2D.Double(x_coord+40, y_coord+20);
      Line2D.Double line1=new Line2D.Double(r1,r2);
      Line2D.Double line2=new Line2D.Double(r3,r4);
      Line2D.Double line3=new Line2D.Double(r5,r6);
      Line2D.Double line4=new Line2D.Double(r7,r8);
      g2.draw(line1);
      g2.draw(line2);
      g2.draw(line3);
      g2.draw(line4);
    }

}
