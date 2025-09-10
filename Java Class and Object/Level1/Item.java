package Level1;
import java.util.*;
public class Item {
    String itemCode;
    String itemName;
    double price;
    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item code: ");
        String itemCode = sc.nextLine();
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        Item item = new Item(itemCode, itemName, price);
        item.displayDetails();
        System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));
        sc.close();
    }
}
