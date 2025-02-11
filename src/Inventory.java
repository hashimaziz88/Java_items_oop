import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventory {

//   arrayList can store objects
    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity,int damage, String type){
        items.add(new Weapon(name, quantity,damage, type));
    }

    public void displayInventory(){
        for (Item item : items){
//            System.out.println("Item: " + item.getName() + ", Quantity:" + item.getQuantity() );
            item.displayInfo();
        }

    }
    public void displayInventory(String type){
        for (Item item : items){
            if (item instanceof Fruit &&((Fruit) item).getType().equalsIgnoreCase(type)){
                System.out.println((item.toString()));
            }
            else if (item instanceof Weapon &&((Weapon) item).getType().equalsIgnoreCase(type)){
                System.out.println((item.toString()));
            }
        }
        }
}
