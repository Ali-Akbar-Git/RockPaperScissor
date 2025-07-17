public class winner {
    private String winner;
    private String player1Choice;
    private String player2Choice;

    winner(String player1Choice, String player2Choice) {
        this.player1Choice = player1Choice;
        this.player2Choice = player2Choice;
    }

    String checkWinner() {
        if (player1Choice.equals(player2Choice)) {
            winner = "It's a draw!";
        } else if ((player1Choice.equals("rock") && player2Choice.equals("scissors")) ||
                (player1Choice.equals("paper") && player2Choice.equals("rock")) ||
                (player1Choice.equals("scissors") && player2Choice.equals("paper"))) {
            winner = "Player wins!";
        } else {
            winner = "CPU wins!";
        }
        return winner;
    }

}
