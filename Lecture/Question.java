public class Question
{
private String text;
private String answer;
private int pointValue;


public Question()
{
        text = "";
        answer = "";
        pointValue=0;
}

public void setText(String questionText)
{
        text = questionText;
}

public void setAnswer(String correctResponse)
{
        answer = correctResponse;
}

public boolean checkAnswer(String response)
{
        return response.equalsIgnoreCase(answer);
}

public void display()
{
        System.out.println(text);
}
public int getPoints()
{
  return pointValue;
}
}
