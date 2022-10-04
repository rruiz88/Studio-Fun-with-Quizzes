public class TrueFalse extends Questions{
    public TrueFalse(String question, String answer) {
        super(question, answer);
    }
        public boolean checkAnswer(String answer) {
            String correctAnswer = this.getAnAnswer();

            if (answer.equals(correctAnswer)) {
                return true;
            } else {
                return false;
            }


        }

    }

