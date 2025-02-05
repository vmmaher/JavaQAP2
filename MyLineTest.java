public class MyLineTest {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1.toString());
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2.toString());
        System.out.println("The length is: " + l2.getLength());
        System.out.println("The gadient is: " + l2.getGradient());
    }
}