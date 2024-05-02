package Model;
import java.awt.Color;

public class Model {
    private Square player1;
    private Square player2;
    private Square player3;

    public Model() {
        // Initialize players with starting positions and colors
        this.player1 = new Square(150, 200, Color.RED, "Player 1");
        this.player2 = new Square(400, 200, Color.BLUE, "Player 2");
        this.player3 = new Square(500, 200, Color.GREEN, "Player 3");
    }

    // Movement methods for Player 1
    public void movePlayer1Up() {
        if (!checkCollision(player1, player1.getX(), player1.getY() - 10)) {
            player1.moveUp();
        }
    }

    public void movePlayer1Down() {
        if (!checkCollision(player1, player1.getX(), player1.getY() + 10)) {
            player1.moveDown();
        }
    }

    public void movePlayer1Left() {
        if (!checkCollision(player1, player1.getX() - 10, player1.getY())) {
            player1.moveLeft();
        }
    }

    public void movePlayer1Right() {
        if (!checkCollision(player1, player1.getX() + 10, player1.getY())) {
            player1.moveRight();
        }
    }

    // Movement methods for Player 2
    public void movePlayer2Up() {
        if (!checkCollision(player2, player2.getX(), player2.getY() - 10)) {
            player2.moveUp();
        }
    }

    public void movePlayer2Down() {
        if (!checkCollision(player2, player2.getX(), player2.getY() + 10)) {
            player2.moveDown();
        }
    }

    public void movePlayer2Left() {
        if (!checkCollision(player2, player2.getX() - 10, player2.getY())) {
            player2.moveLeft();
        }
    }

    public void movePlayer2Right() {
        if (!checkCollision(player2, player2.getX() + 10, player2.getY())) {
            player2.moveRight();
        }
    }

    // Movement methods for Player 3
    public void movePlayer3Up() {
        if (!checkCollision(player3, player3.getX(), player3.getY() - 10)) {
            player3.moveUp();
        }
    }

    public void movePlayer3Down() {
        if (!checkCollision(player3, player3.getX(), player3.getY() + 10)) {
            player3.moveDown();
        }
    }

    public void movePlayer3Left() {
        if (!checkCollision(player3, player3.getX() - 10, player3.getY())) {
            player3.moveLeft();
        }
    }

    public void movePlayer3Right() {
        if (!checkCollision(player3, player3.getX() + 10, player3.getY())) {
            player3.moveRight();
        }
    }

    // Getters for the players
    public Square getPlayer1() {
        return player1;
    }

    public Square getPlayer2() {
        return player2;
    }

    public Square getPlayer3() {
        return player3;
    }

    // Check collision avoiding self-collision
    private boolean checkCollision(Square movingPlayer, int x, int y) {
        return (movingPlayer != player1 && checkCollisionWithPlayer(player1, x, y)) ||
               (movingPlayer != player2 && checkCollisionWithPlayer(player2, x, y)) ||
               (movingPlayer != player3 && checkCollisionWithPlayer(player3, x, y));
    }

    private boolean checkCollisionWithPlayer(Square player, int x, int y) {
        if (player.getX() == x && player.getY() == y) {
            System.out.println("Collision detected at (" + x + ", " + y + ") with " + player.getName());
            return true;
        }
        return false;
    }
}
