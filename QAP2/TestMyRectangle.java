public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyRectangle instance using MyPoint instances
        MyPoint topLeft = new MyPoint(1, 4);
        MyPoint bottomRight = new MyPoint(5, 1);
        MyRectangle rect1 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rect1); 

        // Create MyRectangle instance using coordinates
        MyRectangle rect2 = new MyRectangle(2, 6, 8, 3);
        System.out.println(rect2); 

        // Test getters and setters
        rect1.setTopLeft(new MyPoint(0, 5));
        rect1.setBottomRight(new MyPoint(6, 2));
        System.out.println("Updated rect1: " + rect1); 

        // Test getWidth, getHeight, getArea, and getPerimeter methods
        System.out.println("Width of rect1: " + rect1.getWidth()); // Expected: 6
        System.out.println("Height of rect1: " + rect1.getHeight()); // Expected: 3
        System.out.println("Area of rect1: " + rect1.getArea()); // Expected: 18
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter()); // Expected: 18

        System.out.println("Width of rect2: " + rect2.getWidth()); // Expected: 6
        System.out.println("Height of rect2: " + rect2.getHeight()); // Expected: 3
        System.out.println("Area of rect2: " + rect2.getArea()); // Expected: 18
        System.out.println("Perimeter of rect2: " + rect2.getPerimeter()); // Expected: 18
    }
}

