import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

// dziedziczenie - main staje się oknem
// Actionlistener trzeba zaimplementować alt enter
public class Main extends JFrame implements ActionListener {

    private QuestionGenerator questionGenerator = new QuestionGenerator();
    private List<Question> questionList = questionGenerator.generateQuestions();
    private int currentQuestion = 0;
    private JLabel label;
    private JButton aButton;
    private JButton bButton;
    private JButton cButton;
    private JButton dButton;

    public Main() {
        setSize(500, 500);
        setTitle("Quiz");
        setDefaultCloseOperation(3); // możemy zamknąć okno
        setVisible(true); // widoczne
        label = new JLabel(questionList.get(0).getText(), SwingConstants.CENTER);
        label.setFont(new Font("Monaco", Font.PLAIN, 20));
        aButton = new JButton("A. " + questionList.get(currentQuestion).getAnswerA().toString()); // przycisk a
        bButton = new JButton("B. " + questionList.get(currentQuestion).getAnswerB().toString()); // przycisk b
        cButton = new JButton("C. " + questionList.get(currentQuestion).getAnswerC().toString()); // przycisk c
        dButton = new JButton("D. " + questionList.get(currentQuestion).getAnswerD().toString()); // przycisk d
        setLayout(new GridLayout(2, 1));
        add(label);

        Container container = new Container();
        container.setLayout(new GridLayout(2, 2));
        container.add(aButton);
        container.add(bButton);
        container.add(cButton);
        container.add(dButton);
        add(container);
        aButton.addActionListener(this);
        bButton.addActionListener(this);
        cButton.addActionListener(this);
        dButton.addActionListener(this);
    }


    public static void main(String[] args) {
        // wyświetlenie okna
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();

            }
        });
    }

    private int numberOfPoints = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentQuestion + 1 <= questionList.size()) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            Color tempColor = aButton.getBackground();
            if (buttonText.equals(aButton.getText()) && questionList.get(currentQuestion).isAnswerACorrect()) {
                numberOfPoints++;

            }

            if (buttonText.equals(bButton.getText()) && questionList.get(currentQuestion).isAnswerBCorrect()) {
                numberOfPoints++;
            }
            if (buttonText.equals(cButton.getText()) && questionList.get(currentQuestion).isAnswerCCorrect()) {
                numberOfPoints++;

            }
            if (buttonText.equals(dButton.getText()) && questionList.get(currentQuestion).isAnswerDCorrect()) {
                numberOfPoints++;

            }


            currentQuestion++;

            System.out.println(numberOfPoints);
            if (currentQuestion != questionList.size()) {

                label.setText(questionList.get(currentQuestion).getText());
                // zmienia numer obecnego pytania przez currentquestion ++
            }
        } else {
            aButton.setEnabled(false);
            bButton.setEnabled(false);
            cButton.setEnabled(false);
            dButton.setEnabled(false);
            System.out.println("Koniec gry");
            JOptionPane.showMessageDialog(this, "Twoja liczba punktów to " + numberOfPoints);

        }
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);


    }
    // zmodyfikować aby dodać trzecią odpowiedź i zrozumieć kod
    // różne odpowiedzi
    // punkty ujemne
    // będzie test końcowy

}
