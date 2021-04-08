import java.awt.Point;
import java.util.*;

public class PolyLine {
    private ArrayList<Point> points;
    
    public PolyLine() {
        points = new ArrayList<Point>();
    }
    
    public PolyLine(Point object) {
        points = new ArrayList<Point>();
        points.add(object);
    }
    
    public PolyLine(Point[] objectArray) {
        points = new ArrayList<Point>(Arrays.asList(objectArray));
    }
    
    public PolyLine(List<Point> objectList) {
        points = new ArrayList<Point>();
        for (Point object : objectList) {
            points.add(object);
        }
    }
    
    public String toString() {
        String listString = "";
        for (Point object : points) {
            listString += object.toString() + "\n";
        }
        return listString;
    }
    
    public void appendPoint(Point p) {
        points.add(p);
    }
    
    public void appendPoint(int x, int y) {
        Point p = new Point(x, y);
        points.add(p);
    }
    
    public void removeLastPoint() {
        points.remove(points.size() - 1);
    }
    
    public Point getPoint(int index) {
        return points.get(index);
    }
    
    public int getSize() {
        return points.size();
    }
    
    public double getLength() {
        double totalDistance = 0;
        for (int i = 1; i < points.size(); i++) {
            totalDistance += points.get(i).distance(points.get(i - 1));
        }
        return totalDistance;
    }
    
    public void join(PolyLine anotherLine) {
        points.addAll(anotherLine.points);
    }
}