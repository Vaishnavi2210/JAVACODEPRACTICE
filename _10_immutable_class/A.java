package _10_immutable_class;

public class A {
    final private int x;
    final private int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        // this.x = x;//CTE
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        //this.y = y;//CTE
    }
}