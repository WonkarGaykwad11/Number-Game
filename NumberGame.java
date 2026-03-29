import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGame extends JFrame implements ActionListener {

    JLabel messageLabel, attemptsLabel, scoreLabel;
    JTextField inputField;
    JButton guessButton, resetButton;

    int number, attempts, maxAttempts = 5;
    int totalScore = 0, roundsWon = 0;

    Random rand = new Random();

    public NumberGame() {
        setTitle("Number Guessing Game 🎮");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        messageLabel = new JLabel("Guess number between 1 and 100");
        attemptsLabel = new JLabel("Attempts left: " + maxAttempts);
        scoreLabel = new JLabel("Score: 0 | Wins: 0");

        inputField = new JTextField(10);

        guessButton = new JButton("Guess");
        resetButton = new JButton("New Round");

        add(messageLabel);
        add(inputField);
        add(guessButton);
        add(resetButton);
        add(attemptsLabel);
        add(scoreLabel);

        guessButton.addActionListener(this);
        resetButton.addActionListener(e -> resetGame());

        resetGame();
        setVisible(true);
    }

    public void resetGame() {
        number = rand.nextInt(100) + 1;
        attempts = 0;
        attemptsLabel.setText("Attempts left: " + maxAttempts);
        messageLabel.setText("Guess number between 1 and 100");
        inputField.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int guess = Integer.parseInt(inputField.getText());
            attempts++;

            if (guess == number) {
                messageLabel.setText("✅ Correct!");
                roundsWon++;
                totalScore += (maxAttempts - attempts + 1) * 10;
                updateScore();
                disableInput();
            } else if (guess < number) {
                messageLabel.setText("📉 Too Low!");
            } else {
                messageLabel.setText("📈 Too High!");
            }

            attemptsLabel.setText("Attempts left: " + (maxAttempts - attempts));

            if (attempts >= maxAttempts && guess != number) {
                messageLabel.setText("❌ Lost! Number was " + number);
                disableInput();
            }

        } catch (Exception ex) {
            messageLabel.setText("⚠ Enter valid number!");
        }

        inputField.setText("");
    }

    void updateScore() {
        scoreLabel.setText("Score: " + totalScore + " | Wins: " + roundsWon);
    }

    void disableInput() {
        guessButton.setEnabled(false);
    }

    public static void main(String[] args) {
        new NumberGame();
    }
}