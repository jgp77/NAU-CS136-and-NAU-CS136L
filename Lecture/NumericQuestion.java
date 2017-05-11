public class NumericQuestion extends Question
{
private double number;
private double answer;
private int pointValue;

public NumericQuestion()
{
        number=0;
        answer=0;
        pointValue=1;
}
public void setAnswer(double correctResponse)
{
        answer = correctResponse;
}
public boolean checkAnswer(double response)
{
        if (((answer-0.01)<=response)&&(response<=(answer+0.01)))
        {
                return true;
        }
        else
        {
                return false;
        }
}
public int getPoints()
{
  return pointValue;
}
}
