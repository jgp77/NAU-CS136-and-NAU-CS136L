import java.util.Scanner;
import java.util.ArrayList;

public class QuestionsApp
{
public static void main(String[] args)
{
        NumericQuestion numq1=new NumericQuestion();
        numq1.setText("What is 8*3?");
        numq1.setAnswer(24.0);
        NumericQuestion numq2=new NumericQuestion();
        numq2.setText("What is 2/3 rounded to 5 decimal places?");
        numq2.setAnswer(0.66667);
        FillInQuestion fiq1=new FillInQuestion();
        fiq1.setText("The capital of Arizona is ");
        fiq1.setAnswer("_Phoenix_");
        FillInQuestion fiq2=new FillInQuestion();
        fiq2.setText("The current President of the United States is ");
        fiq2.setAnswer("_Donald Trump_");
        AnyCorrectChoiceQuestion accq1= new AnyCorrectChoiceQuestion();
        accq1.setText("How many planets are in the solar system?\nSeven\nEight\nNine\nTen");
        accq1.setAnswer("Eight");
        accq1.setAnswer("Nine"); // Because pluto
        AnyCorrectChoiceQuestion accq2= new AnyCorrectChoiceQuestion();
        accq2.setText("What language is Java similar to?\nC\nC++\nPython\nAssembly");
        accq2.setAnswer("C");
        accq2.setAnswer("C++");


        ArrayList<Question> questionList=new ArrayList<Question>();
        questionList.add(numq1);
        questionList.add(numq2);
        questionList.add(fiq1);
        questionList.add(fiq2);
        questionList.add(accq1);
        questionList.add(accq2);
        presentQuestion(questionList);
}

public static void presentQuestion(ArrayList<Question> questionList)
{
  Question question=new Question();
  int points=0;
  for(int i=0;i!=(questionList.size());i++)
  {
        (questionList.get(i)).display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        if((questionList.get(i)).checkAnswer(response))
        {
          points+=(questionList.get(i)).getPoints();
          System.out.println("Correct!\n");

        }
        else
        {
          System.out.println("Incorrect!\n");
        }
  }
System.out.println("You got "+points+" out of 6 points.");
}
}
