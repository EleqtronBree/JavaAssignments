interface ITurnable {
    public void turn();
}

class Book implements ITurnable {
    private int pageNumber = 1;
    
    public void turn() {
        pageNumber++;
        System.out.printf("To page %d\n", pageNumber);
    }
}

class Coin implements ITurnable {
    private boolean isHead = false;
    
    public void turn() {
        if (isHead == false) {
            isHead = true;
            System.out.println("Head");
        } else {
            isHead = false;
            System.out.println("Tail");
        }
    }
}