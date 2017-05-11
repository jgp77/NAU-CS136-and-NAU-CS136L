public class AnyCorrectChoiceQuestion extends Question
{
        private String answers;

        public AnyCorrectChoiceQuestion()
        {
                answers="";
        }
        public void setAnswer(String correctResponse)
        {
                answers=correctResponse+" "+answers;
        }
        public boolean checkAnswer(String response)
        {
                return answers.contains(response);
        }
}
