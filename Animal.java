abstract class Animal {
    public abstract void canDo();
}

class Human extends Animal {
    public void canDo() {
        System.out.println("I can walk and run");
    }
}

class Snake extends Animal {
    public void canDo() {
        System.out.println("I can crawl");
    }
}

class Dog extends Animal {
    public void canDo() {
        System.out.println("I can bark");
    }
}

class Lion extends Animal {
    public void canDo() {
        System.out.println("I can roar");
    }
}
