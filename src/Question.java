public class Question {
    private String text;
    private Answer answerA;
    private Answer answerB;
    private Answer answerC;
    private Answer answerD;

    public Question(String text, Answer answerA, Answer answerB, Answer answerC, Answer answerD) {
        this.text = text;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Answer getAnswerA() {
        return answerA;
    }

    public void setAnswerA(Answer answerA) {
        this.answerA = answerA;
    }

    public Answer getAnswerB() {
        return answerB;
    }

    public void setAnswerB(Answer answerB) {
        this.answerB = answerB;
    }

    public Answer getAnswerC() {
        return answerC;
    }

    public void setAnswerC(Answer answerC) {
        this.answerC = answerC;
    }

    public Answer getAnswerD() {
        return answerD;
    }

    public void setAnswerD(Answer answerD) {
        this.answerD = answerD;
    }

    public boolean isAnswerACorrect() {
        return answerA.isCorrect();
    }

    public boolean isAnswerBCorrect() {
        return answerB.isCorrect();
    }

    public boolean isAnswerCCorrect() {
        return answerC.isCorrect();
    }

    public boolean isAnswerDCorrect() {
        return answerD.isCorrect();
    }
}