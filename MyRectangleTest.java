public class MyRectangleTest {
    public static void main(String[] args) {
        // test default
        MyRectangle r1 = new MyRectangle();
        System.out.println("r1: " + r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // test with coordinates
        MyRectangle r2 = new MyRectangle(0, 5, 2, 0);
        System.out.println("\nr2: " + r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}
