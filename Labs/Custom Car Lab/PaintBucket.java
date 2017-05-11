import java.awt.*;

public class PaintBucket
{
  Color color=new Color(0,0,0);
  private int rd=0;
  private int grn=0;
  private int blu=0;
  // Creates a new color and variables for red, green, and blue
  public void addColor(int r,int g, int b)
  {

    rd=(int)((rd*.5)+(r*.5));
    grn=(int)((grn*.5)+(g*.5));
    blu=(int)((blu*.5)+(b*.5));
    // Calculates the color with an even split

    if (rd>255)
    {
      rd=255;
    }
    if (grn>255)
    {
      grn=255;
    }
    if (blu>255)
    {
      blu=255;
    }
    // Checks to see if colors are above 255
      color=new Color(rd,grn,blu);
      // Updates the color with new values
    }
  public Color getColor()
  {
    return color;
    // Returns the color
  }
}
