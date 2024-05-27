public class MyPoint {
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to return coordinates as an array
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Method to set coordinates
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
