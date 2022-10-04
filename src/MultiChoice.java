public class MultiChoice extends Questions {
    public MultiChoice(String question, String answer) {
        super(question, answer);
    }
        public boolean checkAnswer(String answer) {
            String correctAnswer = this.getAnAnswer();


            return answer.equals(correctAnswer);


        }
    }
