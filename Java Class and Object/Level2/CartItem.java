package Level2;
import java.util.*;
public class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " items. New quantity: " + quantity);
    }
    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            System.out.println("Removed " + qty + " items. New quantity: " + quantity);
        } else {
            System.out.println("Cannot remove more than current quantity");
        }
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter initial quantity: ");
        int quantity = sc.nextInt();
        CartItem item = new CartItem(itemName, price, quantity);
        System.out.print("Enter quantity to add: ");
        int addQty = sc.nextInt();
        item.addItem(addQty);
        System.out.print("Enter quantity to remove: ");
        int remQty = sc.nextInt();
        item.removeItem(remQty);
        item.displayTotalCost();
        sc.close();
    }
}
