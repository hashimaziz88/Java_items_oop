//extends does inherit item
public class Fruit implements ItemStuff {
//  inheritance
    private String name;
    private int quantity;
    private String type;

//  super allows the inherited attributes to be initialised in constructor
    public Fruit( String name, int quantity, String type){
        this.name = name;
        this.quantity = quantity
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }


    @Override
    public void displayInfo(){
         System.out.println("Item: " + getName() + ", Quantity:" + getQuantity() + ", Type:" + getType());
    }

}
