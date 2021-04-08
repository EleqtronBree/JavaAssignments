import java.awt.Point;

class MySquare2D {
    protected Point topLeft;
    protected int sideLength = 10;
    
    public MySquare2D() {
        topLeft = new Point(0, 0);
    }
    
    public MySquare2D(Point p) {
        topLeft = p;
    }
    
    public MySquare2D(int length) {
        topLeft = new Point(0, 0);
        sideLength = length;
    }
    
    public MySquare2D(Point p, int length) {
        topLeft = p;
        sideLength = length;
    }
    
    public MySquare2D(int x, int y, int length) {
        topLeft = new Point(x, y);
        sideLength = length;
    }
    
    public String toString() {
        return String.format("MySquare2D:(%d, %d), side=%d", topLeft.x, topLeft.y, sideLength);
    }
    
    public Point getTopLeft() {
        return topLeft;
    }
    
    public int getSideLength() {
        return sideLength;
    }
    
    public void setTopLeft(Point p) {
        if (p.x >= 0) {
            topLeft.x = p.x;
        }
        if (p.y >= 0) {
            topLeft.y = p.y;
        }
    }
    
    public void setTopLeft(int x, int y) {
        if (x >= 0) {
            topLeft.x = x;
        }
        if (y >= 0) {
            topLeft.y = y;
        }
    }
    
    public void setSideLength(int length) {
        if (length > 0) {
            sideLength = length;
        }
    }
    
    public int getArea() {
        return ((int) Math.pow(sideLength, 2));
    }
    
    public int getPerimeter() {
        return (sideLength * 4);
    }
    
    public boolean equals(MySquare2D another) {
        if ((topLeft.x == another.topLeft.x) && (topLeft.y == another.topLeft.y) && (sideLength == another.sideLength)) {
            return true;
        }
        return false;
    }
}

class MyCubeSub extends MySquare2D {
    public MyCubeSub() {
        super();
    }
    
    public MyCubeSub(int sideLength) {
        super(sideLength);
    }
    
    public MyCubeSub(Point p) {
        super(p);
    }
    
    public MyCubeSub(Point p, int sideLength) {
        super(p, sideLength);
    }
    
    public MyCubeSub(int x, int y, int sideLength) {
        super(x, y, sideLength);
    }
    
    public MyCubeSub(MySquare2D square) {
        super(square.topLeft, square.sideLength);
    }
    
    public String toString() {
        return String.format("MyCube: %s", super.toString());
    }
    
    public int getVolume() {
        return (super.getArea() * super.getSideLength());
    }
    
    public int getSurfaceArea() {
        return (6 * super.getArea());
    }
}