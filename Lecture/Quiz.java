/**
 * Creates a new object of a person.
 * Takes in a person's name and a person's height
 *
 * @param  score  double of the score on a test
 * @param  letter String of the letter grade on a test
 * @return      Returns score or letter dependent on getter used
 */


public class Quiz implements Measurable
{
private double score;
private String letter;
// Initializes a double and a String
public Quiz(double score,String letter)
{
        this.score=score;
        this.letter=letter;
        // Sets the score and letter to a double and a String
}
public double getMeasure()
{
        return score;
        // Returns the double score, overides getMeasure
}
public double getScore()
{
        return score;
        // Returns the double score
}
public String getGrade()
{
        return letter;
        // Returns the String letter
}
}
