public class QuizRunner {
    public static void main(String[] args) {


        Quiz aQuiz = new Quiz();
        MultiChoice firstMultiChoice = new MultiChoice("What day is the SuperBowl played in?\n" + "(a)sunday\n(b)friday\n(c)monday\n(d)thursday\n", "a");
        aQuiz.addQuestion(firstMultiChoice);

        Checkbox firstCheckBox = new Checkbox("What days do we have class?\n" + "(a)sunday\n(b)friday\n(c)monday\n(d)thursday\n","cd");
        aQuiz.addQuestion(firstCheckBox);

        TrueFalse firstTrueFalse = new TrueFalse("True or False: LaunchCode is great?\n", "true");
        aQuiz.addQuestion(firstTrueFalse);

        aQuiz.runQuiz();
    }


}
