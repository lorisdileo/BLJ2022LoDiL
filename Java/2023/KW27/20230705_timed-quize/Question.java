package ch.noseryoung;
import java.util.ArrayList;
import java.util.List;


public class Question {
    private String text;
    private List<String> answers;
    private int correctAnswerIndex;

    public Question(String text) {
        this.text = text;
        answers = new ArrayList<>();
        correctAnswerIndex = + 1;
    }

    public void addAnswer(String answer, boolean isCorrect) {
        answers.add(answer);
        if (isCorrect) {
            correctAnswerIndex = answers.size() - 1;
        }
    }

    public String getText() {
        return text;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
