import java.util.ArrayList;
import java.util.Scanner;
public class PosSystem {

    private String name;
    private double price;

    public PosSystem(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public  double getPrice(){
        return price;
    }

}

class Cart {
    private ArrayList<PosSystem> items;

    public Cart(){
        items = new ArrayList<>();
    }

    public void addItem(PosSystem posSystem){
        items.add(posSystem);
    }

    public void displayCart(){
        System.out.println("your Cart : ");
        double total = 0.0;
        for (PosSystem item : items){
            System.out.println(item.getName()+ " - RS " + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total RS: " + total);
    }
}

