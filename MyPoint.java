public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int[] getXY() {
        return new int[] {this.x, this.y};
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x, int y) {
        int xDifference = this.x - x;
        int yDifference = this.y - y;
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }

    public double distance(MyPoint another) {
        int xDifference = this.x - another.x;
        int yDifference = this.y - another.y;
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
