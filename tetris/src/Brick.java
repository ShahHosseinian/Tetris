import javafx.scene.control.skin.TextInputControlSkin;
import javafx.scene.paint.Color;

class Brick {

    private int x, y;
    private final int width = 3;
    private final int height = 3;
    protected Color color;
    private boolean[][] filledHomes = new boolean[width][height];
    GameBoard gameBoard;

    public Brick(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Brick(GameBoard gameBoard, int x, int y) {

        this.gameBoard = gameBoard;
        this.x = x;
        this.y = y;
    }

    // Setters and Getters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean[][] getFilledHomes() {
        return filledHomes;
    }

    public void setFilledHomes(boolean[][] filledHomes) {
        this.filledHomes = filledHomes;
    }

    public boolean move(Direction direction) {

        switch (direction) {
            case DOWN:
                break;
            case LEFT:
                break;
            case RIGHT:
                break;
            default:
                break;
        }

        // if done
        return true;
    }

    // 90 degree rotation
    public boolean rotate() {

        // if done
        return true;
    }

    // Draw brick on GameBoard
    public void paint() {
    }

    public void freeze() {
    }
}
// hey
