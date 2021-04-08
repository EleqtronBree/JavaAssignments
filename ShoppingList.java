import java.util.ArrayList;
@SuppressWarnings("unused")

public class ShoppingList {
    private String name;
	private int uniqueID;
    private ArrayList<ShoppingItem> items;
    
    public ShoppingList(String name, int id) {
        this.name = name;
        uniqueID = id;
        items = new ArrayList<ShoppingItem>();
    }
    
    public void add(ShoppingItem item) {
        items.add(item);
    }
    
    public String getShoppingList() {
        String list = "";
        for (ShoppingItem item : items) {
            list += item + "\n";
        }
        return list;
    }
    
    public double getTotalCost() {
        double total = 0;
        for (ShoppingItem item : items) {
            total += item.getItemCost();
        }
        return total;
    }
    
    public String toString() {
        return String.format("The total cost of the shopping list for %s is $%.2f.", name, getTotalCost());
    }
}