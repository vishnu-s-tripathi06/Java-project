import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        double price,total,original_price;
        String item;
        int quantity,discount;
        String currency="$";

    System.out.print("What do you want: ");
    item=scanner.nextLine();

    System.out.print("What is the price for each: ");
    price=scanner.nextDouble();

    System.out.print("how many would you like: ");
    quantity=scanner.nextInt();

    System.out.print("How much is the discount percentage: ");
    discount=scanner.nextInt();
    original_price=price*quantity;
    System.out.println("Original price $"+original_price);
    total=(1-discount/100.0)*price*quantity;
    System.out.println("you total Bill is: "+currency+total);
    scanner.close();
    }
}
