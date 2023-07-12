package ch.noseryoung;
import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int currentQuestionIndex;

    public Quiz() {
        questions = new ArrayList<>();
        currentQuestionIndex = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public Question getCurrentQuestion() {
        if (currentQuestionIndex >= 0 && currentQuestionIndex < questions.size()) {
            return questions.get(currentQuestionIndex);
        }
        return null;
    }

    public Question getQuestion(int index) {
        return questions.get(index);
    }

    public void moveToNextQuestion() {
        currentQuestionIndex++;
    }

    public boolean isLastQuestion() {
        return currentQuestionIndex == questions.size() - 1;
    }

    public void reset() {
        currentQuestionIndex = 0;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
