public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    /**
     * Constructs a MyRectangle instance using two MyPoint instances.
     *
     * @param topLeft the top-left corner of the rectangle
     * @param bottomRight the bottom-right corner of the rectangle
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Constructs a MyRectangle instance using coordinates.
     *
     * @param x1 the x-coordinate of the top-left corner
     * @param y1 the y-coordinate of the top-left corner
     * @param x2 the x-coordinate of the bottom-right corner
     * @param y2 the y-coordinate of the bottom-right corner
     */
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Getter and setter for topLeft
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter and setter for bottomRight
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Calculate width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Calculate height of the rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculate area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculate perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method to describe the rectangle
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight +
                ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}

