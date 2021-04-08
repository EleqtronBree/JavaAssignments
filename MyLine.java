import java.awt.Point;

public class MyLine {
    private Point startPoint;
    private Point endPoint;
    
    public MyLine() {
        startPoint = new Point(0,0);
        endPoint = new Point(0,0);
    }
    
    public MyLine(int x1, int y1, int x2, int y2) {
        startPoint = new Point(x1,y1);
        endPoint = new Point(x2,y2);
    }
    
    public MyLine(Point x, Point y) {
        startPoint = x;
        endPoint = y;
    }
    
    public String toString() {
        return String.format("%s to %s", startPoint, endPoint);
    }
    
    public int getX() {
        return startPoint.x;
    }
    
    public int getY() {
        return startPoint.y;
    }
    
    public void setX(int x) {
        startPoint.x = x;
    }
    
    public void setY(int y) {
        startPoint.y = y;
    }
    
    public int getEndX() {
        return endPoint.x;
    }
    
    public int getEndY() {
        return endPoint.y;
    }
    
    public void setEndX(int x) {
        endPoint.x = x;
    }
    
    public void setEndY(int y) {
        endPoint.y = y;
    }
    
    public double getLength() {
        return startPoint.distance(endPoint);
    }
}