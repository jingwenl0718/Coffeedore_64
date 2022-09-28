import java.util.ArrayList;

class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // methods
    public void addMenuItem(String name, double price) {
        Item item1 = new Item(name, price);
        menu.add(item1);
        int index = menu.indexOf(item1);
        item1.setIndex(index);
    }

    public void displayMenu() {
        for (Item item: this.menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice() );
        }
    }

    public void newOrder() {
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order1 = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            order1.addItem(menu.get(Integer.parseInt(itemNumber)));
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        order1.display();
    }

    // bonus question: 
    public void addMenuItemByAdmin() {
        System.out.println("Please enter a new item name or q to quit:");
        String itemName = System.console().readLine();
        while (!itemName.equals("q")) {
            System.out.println("Please enter the price of the new item:");
            double itemPrice = Double.parseDouble(System.console().readLine());
            addMenuItem(itemName, itemPrice);
            displayMenu();
            System.out.println("Please enter a new item name or q to quit:");
            itemName = System.console().readLine();
        }
    }

}