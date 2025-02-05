public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        System.out.println(p1.toString());
        p1.setX(8);
        p1.setY(6);
        System.out.println(p1.toString());

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2.toString());

        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
    }
}
