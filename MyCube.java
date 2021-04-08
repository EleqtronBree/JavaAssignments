import java.awt.Point;

public class MyCube {
    private MySquare2D base;
    
    public MyCube() {
        base = new MySquare2D(new Point(0,0), 10);
    }
    
    public MyCube(int length) {
        base = new MySquare2D(new Point(0,0), length);
    }
    
    public MyCube(Point topLeft) {
        base = new MySquare2D(topLeft, 10);
    }
    
    public MyCube(Point topLeft, int length) {
        base = new MySquare2D(topLeft, length);
    }
    
    public MyCube(int x, int y, int length) {
        base = new MySquare2D(new Point(x, y), length);
    }
    
    public MyCube(MySquare2D square) {
        base = square;
    }
    
    public String toString() {
        return String.format("MyCube: MySquare2D:(%d, %d), side=%d", base.topLeft.x, base.topLeft.y, base.sideLength);
    }
    
    public int getVolume() {
        return ((int) base.getArea() * base.getSideLength());
    }
    
    public int getSurfaceArea() {
        return ((int) (6 * base.getArea()));
    }
    
    public MySquare2D getBase() {
        return base;
    }
}