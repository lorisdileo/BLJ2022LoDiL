package ch.noseryoung;


import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizManager {
    private Console console;
    private Quiz quiz;
    private boolean quizStarted;
    private int currentQuestionIndex;
    private Timer timer;
    private boolean timerExpired;
    private int totalScore;

    public QuizManager(Console console) {
        this.console = console;
        this.quiz = new Quiz();
        this.quizStarted = false;
        this.currentQuestionIndex = 0;
        this.timer = null;
        this.timerExpired = false;
        this.totalScore = 0;
        initializeQuiz();
    }

    private void initializeQuiz() {
        Question question1 = new Question("Was ist die Hauptstadt von Frankreich?");
        question1.addAnswer("Zürich", false);
        question1.addAnswer("Paris", true);
        question1.addAnswer("Rom", false);
        quiz.addQuestion(question1);

        Question question2 = new Question("Welches ist das höchste Gebirge der Welt?");
        question2.addAnswer("Himalaya", true);
        question2.addAnswer("Alpen", false);
        question2.addAnswer("Rocky Mountains", false);
        quiz.addQuestion(question2);

        Question question3 = new Question("Eine Seemeile entspricht... Meter");
        question3.addAnswer("1609", false);
        question3.addAnswer("914", false);
        question3.addAnswer("1852", true);
        quiz.addQuestion(question3);

        Question question4 = new Question("Wie hieß der zweite Mensch auf dem Mond?");
        question4.addAnswer("Buzz Aldrin", true);
        question4.addAnswer("Neil Armstrong", false);
        question4.addAnswer("Michael Collins", false);
        quiz.addQuestion(question4);

        Question question5 = new Question("Wie lang ist die Küstenlänge von Australien? In Kilometer");
        question5.addAnswer("68.000", false);
        question5.addAnswer("37.000", true);
        question5.addAnswer("107.000", false);
        quiz.addQuestion(question5);

        Question question6 = new Question("Was ist die Strukturformel von Benzol?");
        question6.addAnswer("C6H6", true);
        question6.addAnswer("CH4", false);
        question6.addAnswer("C2H6O", false);
        quiz.addQuestion(question6);
    }

    public void handleTextInput(String textInput) {
        console.appendLine("└> " + textInput);

        if (quizStarted) {
            processUserAnswer(textInput);
        } else {
            if (textInput.equalsIgnoreCase("start")) {
                startQuiz();
            } else {
                console.appendLine("Geben Sie 'start' ein, um das Quiz zu beginnen.");
            }
        }
    }


    private void startQuiz() {
        quizStarted = true;
        currentQuestionIndex = 0;
        timerExpired = false;
        askCurrentQuestion();
        startTimer();
    }

    private void askCurrentQuestion() {
        List<Question> questions = quiz.getQuestions();

        if (currentQuestionIndex < questions.size()) {
            Question currentQuestion = questions.get(currentQuestionIndex);
            console.appendLine("Frage: " + currentQuestion.getText());
            List<String> answers = currentQuestion.getAnswers();
            for (int i = 0; i < answers.size(); i++) {
                console.appendLine((i + 1) + ". " + answers.get(i));
            }
        }
    }

    private void startTimer() {
        timerExpired = false;
        timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timerExpired = true;
                console.appendLine("Die Zeit ist abgelaufen!");

                if (!quizStarted) {
                    return;
                }
                nextQuestion();
            }
        }, 10000);
    }

    private void processUserAnswer(String userAnswer) {
        if (timerExpired) {
            console.appendLine("Die Zeit ist abgelaufen.");
            nextQuestion();
            return;
        }

        Question currentQuestion = quiz.getQuestions().get(currentQuestionIndex);
        int correctAnswerIndex = currentQuestion.getCorrectAnswerIndex();

        if (userAnswer.equalsIgnoreCase(String.valueOf(correctAnswerIndex + 1))) {
            console.appendLine("Richtig!");
            totalScore++;
            timer.cancel();
        } else {
            console.appendLine("Falsch! Die richtige Antwort ist: " + (correctAnswerIndex + 1));
            timer.cancel();
        }
        nextQuestion();
    }

    private void nextQuestion() {
        currentQuestionIndex++;
        if (currentQuestionIndex < quiz.getQuestions().size()) {
            askCurrentQuestion();
            startTimer();
        } else {
            console.appendLine("Das Quiz ist beendet. Vielen Dank fürs Spielen!");
            console.appendLine("Gesamtpunktestand: " + totalScore + " von 6"); // Gesamtpunktestand anzeigen
            totalScore = 0;
            quizStarted = false;
            timer.cancel();
        }
    }
}
