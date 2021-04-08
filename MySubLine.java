import java.awt.Point;

@SuppressWarnings("serial")
public class MySubLine extends Point {
    private Point endPoint;
    
    public MySubLine() {
        endPoint = new Point(0, 0);
    }
    
    public MySubLine(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        endPoint = new Point(x2, y2);
    }
    
    public MySubLine(Point x, Point y) {
        super(x);
        endPoint = y;
    }
    
    public String toString() {
        return String.format("%s to %s", super.toString(), endPoint);
    }
    
    public int getEndX() {
        return endPoint.x;
    }
    
    public int getEndY() {
        return endPoint.y;
    }
    
    public void setEndLocation(int x, int y) {
        endPoint.setLocation(x, y);
    }
    
    public double getLength() {
        return endPoint.distance(super.getLocation());
    }
}