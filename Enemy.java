abstract class Enemy {
    protected String name;
    protected String color;
    protected String comesOut;
    
    public Enemy(String name) {
        this.name = name;
    }
    
    public String toString() {
        return String.format("%s is a %s in %s.", name, getClass().getName(), color);
    }
    
    public void comesOut() {
        System.out.printf("The %s can come out at anytime.\n",getClass().getName());
    }
    
    public abstract void eats();
}

class Zombie extends Enemy {
    public Zombie(String name) {
        super(name);
        super.color = "green";
        super.comesOut = "at anytime";
    }
    
    public Zombie(String name, String color) {
        super(name);
        super.color = color;
        super.comesOut = "at anytime";
    }
    
    public void eats() {
        System.out.printf("%s eats human.\n",super.name);
    }
}

class Vampire extends Enemy {
    public Vampire(String name) {
        super(name);
        super.color = "red";
        super.comesOut = "at night";
    }
    
    public Vampire(String name, String color) {
        super(name);
        super.color = color;
        super.comesOut = "at night";
    }
    
    public void eats() {
        System.out.printf("%s drinks human blood.\n", super.name);
    }
}

class Fighter extends Enemy {
    public Fighter(String name) {
        super(name);
        super.color = "any colour";
        super.comesOut = "after lunch";
    }
    
    public Fighter(String name, String color) {
        super(name);
        super.color = color;
        super.comesOut = "after lunch";
    }
    
    public void eats() {
        System.out.printf("%s eats food.\n", super.name);
    }
}