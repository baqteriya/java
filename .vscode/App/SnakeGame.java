
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {

    private class Tile {

        int x, y;

        Tile(int X, int Y) {
            this.x = X;
            this.y = Y;
        }
    }

    int boardWidth;
    int boardHeight;
    int tileSize = 25;
    Tile snakeHead;
    ArrayList<Tile> snakeBody;
    Tile food;
    Random random;
    Timer gameLoop;
    int velocityx;
    int velocityy;
    boolean gameover = false;

    SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        addKeyListener(this);
        setFocusable(true);

        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<>();
        food = new Tile(10, 10);
        random = new Random();
        placeFood();

        velocityx = -1;
        velocityy = 0;
        gameLoop = new Timer(100, this);
        gameLoop.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        for (int i = 0; i < boardWidth / tileSize; i++) {
            g.drawLine(i * tileSize, 0, i * tileSize, boardHeight);
            g.drawLine(0, i * tileSize, boardWidth, i * tileSize);
        }

        g.setColor(Color.red);
        g.fillRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize);

        g.setColor(Color.green);
        g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);

        for (Tile snakePart : snakeBody) {
            g.fillRect(snakePart.x * tileSize, snakePart.y * tileSize, tileSize, tileSize);
        }

        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.setColor(gameover ? Color.red : Color.white);
        g.drawString((gameover ? "Game Over: " : "Score: ") + snakeBody.size(), 10, 20);
    }

    public void placeFood() {
        food.x = random.nextInt(boardWidth / tileSize);
        food.y = random.nextInt(boardHeight / tileSize);
    }

    public boolean collision(Tile tile1, Tile tile2) {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }

    public void move() {
        if (collision(snakeHead, food)) {
            snakeBody.add(new Tile(food.x, food.y));
            placeFood();
        }

        for (int i = snakeBody.size() - 1; i >= 0; i--) {
            Tile snakepart = snakeBody.get(i);
            if (i == 0) {
                snakepart.x = snakeHead.x;
                snakepart.y = snakeHead.y;
            } else {
                Tile prev = snakeBody.get(i - 1);
                snakepart.x = prev.x;
                snakepart.y = prev.y;
            }
        }

        snakeHead.x += velocityx;
        snakeHead.y += velocityy;

        for (Tile snakepart : snakeBody) {
            if (collision(snakeHead, snakepart)) {
                gameover = true;
            }
        }

        if (snakeHead.x < 0 || snakeHead.x >= boardWidth / tileSize
                || snakeHead.y < 0 || snakeHead.y >= boardHeight / tileSize) {
            gameover = true;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
        if (gameover) {
            gameLoop.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && velocityy != 1) {
            velocityx = 0;
            velocityy = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityy != -1) {
            velocityx = 0;
            velocityy = 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityx != 1) {
            velocityx = -1;
            velocityy = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityx != -1) {
            velocityx = 1;
            velocityy = 0;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame snakeGame = new SnakeGame(500, 500);
        frame.add(snakeGame);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
