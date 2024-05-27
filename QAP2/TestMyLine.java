public class TestMyLine {
    public static void main(String[] args) {
        // Create MyLine instance using coordinates
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1); // MyLine[begin=(1, 2), end=(3, 4)]

        // Create MyLine instance using MyPoint instances
        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2); // MyLine[begin=(5, 6), end=(7, 8)]

        // Test getters and setters for begin and end points
        line1.setBegin(new MyPoint(9, 10));
        line1.setEnd(new MyPoint(11, 12));
        System.out.println("Begin: " + line1.getBegin()); // (9, 10)
        System.out.println("End: " + line1.getEnd()); // (11, 12)

        // Test getters and setters for individual coordinates
        line2.setBeginX(13);
        line2.setBeginY(14);
        line2.setEndX(15);
        line2.setEndY(16);
        System.out.println("BeginX: " + line2.getBeginX()); // 13
        System.out.println("BeginY: " + line2.getBeginY()); // 14
        System.out.println("EndX: " + line2.getEndX()); // 15
        System.out.println("EndY: " + line2.getEndY()); // 16

        // Test getters and setters for coordinate arrays
        line1.setBeginXY(17, 18);
        line1.setEndXY(19, 20);
        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("BeginXY: (" + beginXY[0] + ", " + beginXY[1] + ")"); // (17, 18)
        System.out.println("EndXY: (" + endXY[0] + ", " + endXY[1] + ")"); // (19, 20)

        // Test getLength and getGradient methods
        System.out.println("Length of line2: " + line2.getLength()); // Length calculation
        System.out.println("Gradient of line2: " + line2.getGradient()); // Gradient calculation
    }
}
