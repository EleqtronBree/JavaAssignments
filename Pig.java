public class Pig {
    private int age = 1; 
    
    public Pig() {}
    
    public Pig(int age) {
        this.age = age;
    }
    
    public String toString() {
        return "I am a Pig. My age is " + age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    
    public void speak() {
        System.out.println("Oink");
    }   
}