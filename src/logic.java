import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class logic {
    int CPUScore = 0;
    int playerScore = 0;
    private String CPUChoice;
    private String playerChoice;
    private String winner;
    @FXML
    private Label cpu;
    @FXML
    private Label player;

    @FXML
    void rock() {
        playerChoice = "rock";
        start();
    }

    @FXML
    void paper() {
        playerChoice = "paper";
        start();
    }

    @FXML
    void scissors() {
        playerChoice = "scissors";
        start();
    }

    void CPU() {
        double random = Math.random();
        if (random <= 0.33) {
            CPUChoice = "rock";
        } else if (random <= 0.66) {
            CPUChoice = "paper";
        } else {
            CPUChoice = "scissors";
        }
    }

    void winnerCheck() {
        winner win = new winner(playerChoice, CPUChoice);
        winner = win.checkWinner();
        if (winner.equals("Player wins!")) {
            playerScore++;
        } else if (winner.equals("CPU wins!")) {
            CPUScore++;
        }
    }

    void start() {
        CPU();
        winnerCheck();
        Platform.runLater(() -> {
            cpu.setText("" + CPUScore);
            player.setText("" + playerScore);
        });
        showAlert();
    }

    void showAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(winner);
        alert.setContentText("Player Choice: " + playerChoice + "\nCPU Choice: " + CPUChoice);
        alert.showAndWait();
    }
}
