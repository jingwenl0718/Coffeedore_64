import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk1 = new CoffeeKiosk();
        coffeeKiosk1.addMenuItem("latte", 4.50);
        coffeeKiosk1.addMenuItem("drip coffee", 3);
        coffeeKiosk1.addMenuItem("mocha", 5);
        coffeeKiosk1.addMenuItem("capuccino", 4.5);
        coffeeKiosk1.addMenuItem("muffin", 3.75);
        
        // coffeeKiosk1.displayMenu();
        // coffeeKiosk1.newOrder();
        coffeeKiosk1.addMenuItemByAdmin();
    }
}