//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Inventory inventory = new Inventory();

//        Item item = new Item("Generic Item", 10);
//        Fruit fruit = new Fruit("Fuji",20, "Apple");
//        Weapon weapon = new Weapon("Frost Blade", 2,20, "Melee");

        inventory.addItem(item);
        inventory.addItem("Apple",20, "Fuji");
        inventory.addItem("Frost Blade", 2,75, "Melee");

        inventory.displayInventory("Fuji");
    }

}