import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Questions> questions = new ArrayList<Questions>();
    private int score = 0;
    private Scanner input = new Scanner(System.in);

    public Quiz() {
    }

    public ArrayList<Questions> getQuestions() {
        return this.questions;
    }

    public void addQuestion(Questions question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for(Questions question : questions) {
            System.out.println(question.getAQuestion());
            String userInput = this.getAnswer();
            boolean isCorrect = question.checkAnswer(userInput);
            if(isCorrect) {
                this.score++;
            }
        }

        double grade = ((double)this.score / (double)this.questions.size()) * 100;
        System.out.println("Grade: " + grade + "%");
    }

    private String getAnswer() {
        String userInput = input.nextLine();
        return userInput;
    }

    }
