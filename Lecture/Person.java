/**
 * Creates a new object of a person.
 * Takes in a person's name and a person's height
 *
 * @param  personName  String of a person's name. Uses PersonTester.java
 * @param  personHeight double of a person's height. Uses PersonTester.java
 * @return      Returns personHeight or personName dependent on getter used
 */


public class Person implements Measurable
{
    private String personName;
    private double personHeight;
    // Initializes a String and a double

    public Person(String personName,double personHeight)
    {
      this.personHeight=personHeight;
      // sets the personHeight to a double that is taken in
      this.personName=personName;
      // sets the personName to a String that is taken in
    }
    public double getMeasure()
    {
            return personHeight;
            // Returns personHeight, Overides getMeasure
    }
    public double getHeight()
    {
      return personHeight;
      // Returns personHeight
    }
    public String getName()
    {
      return personName;
      // Returns personName
    }
}
