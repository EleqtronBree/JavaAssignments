public class Traffic {
    private String location;
    private int numberOfCars;
    
    public Traffic() {}
    public Traffic(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
    public int getNumberOfCars() {
        return numberOfCars;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void setNumberOfCars(int cars) {
        numberOfCars = cars;
    }
    
    public String toString() {
        return String.format("There are %d cars in %s.", numberOfCars, location);
    }
    
    public boolean isTrafficJam() {
        if (numberOfCars > 100) {
            return true;
        }
        return false;
    }
}