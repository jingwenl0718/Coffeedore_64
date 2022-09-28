class Item {
    // 1. member variables
    private String name;
    private double price;
    private int index;

    // 2. constructor (overloaded constructor & empty constructor)
    public Item() {
        this.name = "Anoymous Item";
        this.price = 4;
        this.index ++;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.index = index;
    }

    // 3. getters and setters
    // getters: return datatype of variable, no parameters
    // naming: getName, getPrice
    public String getName(){
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getIndex() {
        return this.index;
    }

    // setters: no return, with parameters with same datatype
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}