interface Measurable {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle implements Measurable {
    private int radius;
    
    public Circle() {
        radius = 1;
    }
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
    
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }
}

class Square implements Measurable {
    private int side;
    
    public Square() {
        side = 1;
    }
    
    public Square(int side) {
        this.side = side;
    }
    
    public double getArea() {
        return ((double) Math.pow(side, 2));
    }
    
    public double getPerimeter() {
        return ((double) 4 * side);
    }
}