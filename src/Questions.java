public abstract class Questions {
  private String aQuestion;
  private String anAnswer;

    public String getAnAnswer() {
        return anAnswer;
    }

    public String getAQuestion() {
        return aQuestion;
    }

    public abstract boolean checkAnswer(String answer);


    public Questions(String aQuestion, String anAnswer) {
        this.aQuestion = aQuestion;
        this.anAnswer = anAnswer;
    }
}
