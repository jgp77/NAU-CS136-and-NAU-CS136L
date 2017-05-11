import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
@SuppressWarnings("serial")// Needed to supress the warning

public class CarViewer
{
  private CarComponent cars=new CarComponent();
  // Creates a new car component to add to the frame
  private JFrame frame =new JFrame();
  // Creates a frame to hold all of the program
  private JPanel sliderPanel=new JPanel();
  // Creates a panel to hold the interative setters

  private JButton addCar = new JButton("Add Car");
  // Creates a JButton titled Add Car
  private JSlider frontTire = new JSlider(0,50);
  // Slider for the front tire with a range of 0 to 50
  private JSlider backTire = new JSlider(0,50);
  // Slider for the back tire with a range of 0 to 50
  private JSlider carWidth = new JSlider(0,200);
  // Slider for the car width with a range of 0 to 200
  private JTextField yCoor = new JTextField(20);
  // Creates a textfield for the y Coord
  private JTextField xCoor = new JTextField(20);
  // Creates a textfield for the x Coord
  private JButton color=new JButton("Color Chooser");
  // Creates a JButton titled Color Chooser


  private JLabel xLabel=new JLabel("X:");
  // Creates a label for the X Coord
  private JLabel yLabel=new JLabel("Y:");
  // Creates a label for the Y Coord
  private JLabel widthLabel=new JLabel("Car Width");
  // Creates a label for the Car Width slider
  private JLabel fTireLabel=new JLabel("Front Tire");
  // Creates a label for the Front tire slider
  private JLabel rTireLabel=new JLabel("Rear Tire");
  // Creates a label for the Back tire slider

  private int frontWheelSize=25;
  // Int that Stores front wheel size
  private int backWheelSize=25;
  // Int that Stores back wheel size
  private int carSize=100;
  // Int that Stores front car size
  private Color carColor=new Color(0,0,0);
  // Color that holds the car color
  private int xcoord=0;
  // Int that Stores X coord
  private int ycoord=10;
  // Int that Stores Y coord

  public CarViewer()
  {
    createComponents();
    // Creates the components needed for the program
    frame.add(sliderPanel, BorderLayout.WEST);
    // Adds sliderPanel to the frame in the WEST
    frame.add(cars, BorderLayout.CENTER);
    // Adds the cars to the frame in the center
    frame.getContentPane().setBackground(Color.WHITE);
    // Makes the frame Background white
    frame.setSize(400,300);
    // Sets frame size to 400x300
    frame.pack();
    // Packs the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Default close operation
    frame.setLocationRelativeTo(null);
    // Sets the frame to display in the middle of the screen
    frame.setVisible(true);
    //Visibility is true
  }

  private void createComponents()
  {
    cars.addCar(0,0,25,25,100,Color.BLUE);
    // Adds an example car
    cars.addCar(100,100,25,25,100,Color.GREEN);
    // Adds an example car
    cars.addCar(200,200,25,25,100,Color.RED);
    // Adds an example car




    frame.repaint();

    sliderPanel.setLayout(new BoxLayout(sliderPanel, BoxLayout.Y_AXIS));
    // Sets the layout of the panel as a BoxLayout on the Y axis
    sliderPanel.setSize(100,300);
    // Sets size of pannel to 100x300

    addCar.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent actionEvent)
      {
        backWheelSize=backTire.getValue();
        frontWheelSize=frontTire.getValue();
        carSize=carWidth.getValue();
        try
        {
          xcoord=Integer.parseInt(xCoor.getText());
          ycoord=Integer.parseInt(yCoor.getText());
        }
        catch (NumberFormatException e) {}
          // Try and catch to make sure only integers are entered
          cars.addCar(xcoord,ycoord,frontWheelSize,backWheelSize,carSize,carColor);
          // Creates a car based off the data
          frame.repaint();
          // Repaints the frame
        }
      });
      // Creates a listener on the addCar button that grabs data and draws the car

      color.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent actionEvent)
        {
          Color newColor = JColorChooser.showDialog(null, "Change Car Color",carColor);
          // Sets newColor after prompting the user with a Color Chooser
          if (newColor != null)
          // If the color isnt null
          {
            carColor=newColor;
            // Car color is set to new color
          }
        }
      });
      // Adds a listener to the color button to open a color chooser panel

      yCoor.setMaximumSize(yCoor.getPreferredSize());
      xCoor.setMaximumSize(xCoor.getPreferredSize());
      // Sets size of the textfields
      sliderPanel.add(widthLabel);
      sliderPanel.add(carWidth);
      sliderPanel.add(fTireLabel);
      sliderPanel.add(frontTire);
      sliderPanel.add(rTireLabel);
      sliderPanel.add(backTire);
      sliderPanel.add(color);
      sliderPanel.add(xLabel);
      sliderPanel.add(xCoor);
      sliderPanel.add(yLabel);
      sliderPanel.add(yCoor);
      sliderPanel.add(addCar);
      // Adds all components to the slider panel
    }

    public static void main(String[] args)
    {
      CarViewer frame =new CarViewer();
    }
  }
