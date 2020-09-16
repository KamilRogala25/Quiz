import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {

    public List<Question> generateQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Czy Java jest statycznie typowana", new Answer("tak", true), new Answer("nie", false), new Answer("pomidor", false), new Answer("nie wien", false)));
        questions.add(new Question("Czy 10/3=3", new Answer("tak", false), new Answer("nie", true), new Answer("pomidor", false), new Answer("nie wien", false)));
        questions.add(new Question("Czy Java ma wartość nill", new Answer("tak", true), new Answer("nie", false), new Answer("pomidor", false), new Answer("nie wien", false)));
        questions.add(new Question("Czy 10%3 ==0", new Answer("tak", true), new Answer("nie", false), new Answer("pomidor", false), new Answer("nie wien", false)));
        questions.add(new Question("Czy int to klasa", new Answer("tak", true), new Answer("nie", false), new Answer("pomidor", false), new Answer("nie wien", false)));
        questions.add(new Question("Czy Integer to klasa", new Answer("tak", true), new Answer("nie", false), new Answer("pomidor", false), new Answer("nie wien", false)));
        return questions;
    }
}
