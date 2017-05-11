import java.util.ArrayList;

public class ChoiceQuestion extends Question
{
private ArrayList<String> choices;
private int pointValue;

public ChoiceQuestion()
{
        choices = new ArrayList<String>();
        pointValue=3;
}
public void addChoice(String choice, boolean correct)
{
        choices.add(choice);
        if (correct)
        {
                String choiceString = "" + choices.size();
                setAnswer(choiceString);
        }
}
public int getPoints()
{
  return pointValue;
}
public void display()
{
        super.display();
        for (int i = 0; i < choices.size(); i++)
        {
                int choiceNumber = i + 1;
                System.out.println(choiceNumber + ": " + choices.get(i));
        }
}
}
