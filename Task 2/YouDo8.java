class Item {
    String name;
    double price;

Item(String name,double price){

    this.name = name;
    this.price = price;
}
}


class Order{
    
    Item item1;
    Item item2;

    Order(Item item1, Item item2){
    this.item1 = item1;
    this.item2 = item2;
    }

    void printBill(){
    double total = item1.price + item2.price;
    System.out.println("Total Cost: " + total);
}
}

public class Main8 {
    public static void main(String[] args) {
        
        Item i1 = new Item("Mouse", 30.0);

        Item i2 = new Item("Keyboard", 50.0);

        Order order = new Order(i1, i2);

        order.printBill();
    }
}

