public class Rugby {
    private String countryName = "N/A";
    private int points = 0;
    
    public Rugby() {}
    public Rugby(String country) {
        countryName = country;
    }
    public Rugby(String country, int points) {
        countryName = country;
        this.points = points;
    }
    
    public int getPoints() {
        return points;
    }
    
    public String getCountryName() {
        return countryName;
    }
    
    public void setPoints(int points) {
        if (points >= 0) {
            this.points = points;
        }
    }
    
    public void setCountryName(String country) {
        countryName = country;
    }
    
    public String toString() {
        return String.format("Country: %s(%d)", countryName, points);
    }
}