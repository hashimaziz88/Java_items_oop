public abstract class Item {
//  private variables which encapsulates the data within the class
    private String name;
    private int quantity;

//  constructor
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

//  getter and setter methods which allow us to access and edit items
    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public abstract void displayInfo();

//
//    @Override
//    public String toString(){
//        return "Item: " + getName() + ", Quantity:" + getQuantity();
//    }
}
