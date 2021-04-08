public class ShoppingItem {
    private String itemDescription;
    private double price;
    private boolean byWeight;
    private int quantity;
    private double weight;
    
    public ShoppingItem(String item, double price, double weight) {
        itemDescription = item;
        this.weight = weight;
        this.price = price;
        byWeight = true;
    }
    
    public ShoppingItem(String item, double price, int quantity) {
        itemDescription = item;
        this.quantity = quantity;
        this.price = price;
        byWeight = false;
    }
    
    public ShoppingItem(String item, double price) {
        String[] itemList = item.split(" ", 2);
        if (itemList[0].contains("kg")) {
            weight = Double.parseDouble(itemList[0].substring(0, itemList[0].length() - 2));
            byWeight = true;
        } else {
            quantity = Integer.parseInt(itemList[0]);
            byWeight = false;
        }
        itemDescription = itemList[1];
        this.price = price;
    }
    
    public String toString() {
        if (byWeight == true) {
            return String.format("The cost of %.2fkg of %s = $%.2f", weight, itemDescription, getItemCost());
        } else {
            return String.format("The cost of %d %s = $%.2f", quantity, itemDescription, getItemCost());
        }
    }
    
    public double getItemCost() {
        if (byWeight) {
            // calculate total by weight
            return price * weight;
        } else {
            // calculate total by quantity
            return price * quantity;
        }
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getItemDescription() {
        return itemDescription;
    }
    
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }
    
    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}