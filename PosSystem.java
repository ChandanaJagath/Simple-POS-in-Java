import java.util.ArrayList;
import java.util.Scanner;
class Product{

    private String name;
    private double price;

    public Product(String name,double price){
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
    private ArrayList<Product> items;

    public Cart(){
        items = new ArrayList<>();
    }

    public void addItem(Product product){
        items.add(product);
    }

    public void displayCart(){
        System.out.println("your Cart : ");
        double total = 0.0;
        for (Product item : items){
            System.out.println(item.getName()+ " - RS " + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total RS: " + total);
    }
}

 public class PosSystem{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("WELCOME TO THE POS SYSTEM!!!");

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Add Item To Cart :");
            System.out.println("2. Viwe Cart");
            System.out.println("3. Checkout : ");
            System.out.println("4. Exit : ");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice==1){
                System.out.println("Enter The Product Name : ");
                String name = sc.next();

                System.out.println("Enter the Product Price : ");
                double price = sc.nextDouble();

                Product product = new Product(name,price);
                cart.addItem(product);
                System.out.println("Item Add to Cart ! ");
                continue;

            }

            else if (choice==2) {
                cart.displayCart();
                continue;

            }

            else if (choice==3) {
                cart.displayCart();
                System.out.println("Thank you shopping with us!!");
                System.exit(0);
                continue;
            }

            else if (choice==4) {
                System.out.println("Exiting ... ");
                System.exit(0);
                continue;
            }

            else {
                System.out.println("Invalid choice !!!");
                break;
            }
        }

    }
 }

