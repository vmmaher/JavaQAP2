public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // default 
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(1, 1);
    }

    // with MyPoint
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // with xy coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // getters and setters
    public MyPoint getTopLeft() {
        return this.topLeft;
    }

    public MyPoint getBotRight() {
        return this.bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBotRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // calc area
    public int getArea() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }

    // calc perimeter
    public int getPerimeter() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return 2 * (width + height);
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}