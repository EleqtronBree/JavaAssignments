public class QuadraticEquation {
    private double coeff_a;
    private double coeff_b;
    private double coeff_c;
    
    public QuadraticEquation() {}
    public QuadraticEquation(double coeff_a, double coeff_b, double coeff_c) {
        this.coeff_a = coeff_a;
        this.coeff_b = coeff_b;
        this.coeff_c = coeff_c;
    }
    
    public double getCoeff_a() {
        return coeff_a;
    }
    
    public double getCoeff_b() {
        return coeff_b;
    }
    
    public double getCoeff_c() {
        return coeff_c;
    }
    
    public void setCoeff_a(double coeff_a) {
        this.coeff_a = coeff_a;
    }
    
    public void setCoeff_b(double coeff_b) {
        this.coeff_b = coeff_b;
    }
    
    public void setCoeff_c(double coeff_c) {
        this.coeff_c = coeff_c;
    }
    
    public double getDiscriminant() {
        return Math.pow(coeff_b, 2) - (4 * coeff_a * coeff_c);
    }
    
    public boolean hasSolution() {
        if (getDiscriminant() < 0) {
            return false;
        }
        return true;
    }
    
    public double getRoot1() {
        if (!hasSolution()) {
            return 0;
        }
        return (-coeff_b + Math.sqrt(getDiscriminant())) / (2 * coeff_a);
    }
    
    public double getRoot2() {
        if (!hasSolution()) {
            return 0;
        }
        return (-coeff_b - Math.sqrt(getDiscriminant())) / (2 * coeff_a);
    }
    
    public String toString() {
        if (hasSolution()) {
            return String.format("root1=%.2f, root2=%.2f", getRoot1(), getRoot2());
        } else {
            return "No real solutions.";
        }
    }
}