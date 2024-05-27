public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor with coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Constructor with MyPoint instances
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter for begin
    public MyPoint getBegin() {
        return begin;
    }

    // Setter for begin
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter for end
    public MyPoint getEnd() {
        return end;
    }

    // Setter for end
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getter for begin X coordinate
    public int getBeginX() {
        return begin.getX();
    }

    // Setter for begin X coordinate
    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Getter for begin Y coordinate
    public int getBeginY() {
        return begin.getY();
    }

    // Setter for begin Y coordinate
    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Getter for end X coordinate
    public int getEndX() {
        return end.getX();
    }

    // Setter for end X coordinate
    public void setEndX(int x) {
        end.setX(x);
    }

    // Getter for end Y coordinate
    public int getEndY() {
        return end.getY();
    }

    // Setter for end Y coordinate
    public void setEndY(int y) {
        end.setY(y);
    }

    // Getter for begin coordinates as array
    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    // Setter for begin coordinates as array
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    // Getter for end coordinates as array
    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    // Setter for end coordinates as array
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    // Method to calculate the length of the line
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }

    // Method to calculate the gradient of the line
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // toString method
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}

