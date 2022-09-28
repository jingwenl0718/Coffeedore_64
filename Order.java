import java.util.ArrayList;

class Order {
    // 1. private member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // 2. constructor (empty constructor & overload constructor)
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // 3. methods
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double sum = 0;
        for (Item item: this.items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item: this.items) {
            System.out.printf("%s - $%s\n", item.getName(), item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    // 4. getters
    public String getName() {
        return this.name;
    }
    public boolean getReady() {
        return this.ready;
    }
    public ArrayList<Item> getItems() {
        return this.items;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
