package zadanie14;

public class Item {
    private static int numItems = 0;
    private final int ID;

    public Item(int ID) {
        this.ID = ID;
    }
    public Item(){
        ID = getNextId()-1;
    }
    public static int getNextId() {
        numItems++;
        return numItems;
    }
    /*public static Item getItem() {
        Item item = new Item(getNextId());
        return item;
    }*/
    public static void printNumItems() {
        System.out.println("Aktualna wartosc numItems: "+numItems);
    }
    public void printId() {
        System.out.println("ID: "+ID);
    }

}
