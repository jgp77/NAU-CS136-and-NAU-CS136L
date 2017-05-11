public class FillInQuestion extends Question
{
private String text;
private String answer;
private int pointValue;

public FillInQuestion()
{
        text = "";
        answer = "";
        pointValue=2;

}

public void setAnswer(String correctResponse)
{
        if (correctResponse.charAt(correctResponse.length()-1)=='_' && correctResponse.charAt(0)=='_')
        {
                correctResponse = correctResponse.replaceAll("_"," ");
                correctResponse= correctResponse.trim();
                text=text + "____";
                answer=correctResponse;
        }
        else
        {
                answer=correctResponse;
        }
}
public boolean checkAnswer(String response)
{
        return answer.contains(response);
}
public int getPoints()
{
  return pointValue;
}
}
