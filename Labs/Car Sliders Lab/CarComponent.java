import java.awt.*;
import javax.swing.*;
import java.util.*;


@SuppressWarnings("serial")
public class CarComponent extends JComponent
{
  private ArrayList<Car> cars;
  public CarComponent()
  {
    cars = new ArrayList<Car>();
  }

  public void addCar(int x, int y, int front, int back, int width, Color color)
  {
    cars.add(new Car(x, y, front ,back, width,color));
  }

  public void paintComponent(Graphics g)
  {
    Graphics2D g2d = (Graphics2D) g;

    for(Car car : cars) {
      car.draw(g2d);
    }
  }

  @Override
  public Dimension getPreferredSize(){return (new Dimension(300,300));}
}
