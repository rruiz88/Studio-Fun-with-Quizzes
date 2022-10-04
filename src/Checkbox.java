public class Checkbox extends Questions{
    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getAnAnswer();

    return answer.equals(correctAnswer);


}

}
