import java.util.Scanner;
public class madLibs {
    public static void main(){

        Scanner scanner;
        scanner = new Scanner(System.in);
        String adjective1,adjective2,verb,noun,adjective3;
        System.out.print("Adjective: ");
        adjective1=scanner.nextLine();

        System.out.print("adjective2: ");
        adjective2=scanner.nextLine();

        System.out.print("adjective3: ");
        adjective3=scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun=scanner.nextLine();

        System.out.print("enter a verb: ");
        verb=scanner.nextLine();


        System.out.println("Today I went to "+adjective1+ " Zoo.");
        System.out.println("In an exhibit, I saw a "+noun+ " . ");    
        System.out.println(noun+" was "+adjective2+" and "+verb+"!");
        System.out.println("I was "+adjective3+"!");
        
        scanner.close();
    }
    
    
}
