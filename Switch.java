import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter a fruits name: ");
        Scanner input = new Scanner(System.in);
        String fruit=input.next().trim().toLowerCase();
        switch(fruit){
            case "mango"-> System.out.println("King of fruits");
            case "orange" -> System.out.println("citrious fruit");
            case "guava"->System.out.println("A Normal fruit");
            default->System.out.println("ek fal daal le bsdk");
        }
    }
}
