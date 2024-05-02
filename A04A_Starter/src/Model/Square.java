package Model;

import java.awt.*;

public class Square {
    private int x;
    private int y;

    private Color color;
    private String playerName;
    private static final int MOVE_DISTANCE = 20; // Increase move distance for faster movement

    public Square(int x, int y, Color color, String playerName) {
        this.x = x;
        this.y = y;
        this.color  = color;
        this.playerName = playerName;
    }

    public void draw(Graphics g) {
        // add player number on top
        g.setColor(Color.BLACK);
        g.drawString(playerName, x, y + 65);

        g.setColor(color);
        g.fillRect(x, y, 50, 50); // Draw a 50x50 square at position (x, y)
    }

    // Update move methods to use MOVE_DISTANCE
    public void moveUp() {
        y -= MOVE_DISTANCE;
    }

    public void moveDown()  {
        y += MOVE_DISTANCE;
    }

    public void moveLeft() {
        x -= MOVE_DISTANCE;
    }

    public void moveRight() {
        x += MOVE_DISTANCE;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        playerName = name;
    }
}
