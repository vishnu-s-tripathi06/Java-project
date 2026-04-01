
import java.util.Scanner;
public class helloWorld {
    
    public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Your Name is: "+name);
            System.out.println("Enter your age: ");
            int age=scanner.nextInt();
            boolean is_student=true;
            if(name=="saksham"){
                System.out.println("You cannot enter the campus!");}
            else if (is_student && age>18){
                System.out.println("Welcome to the collage.");
            }
            else{System.out.println("you're not student.");
            }
            scanner.close();
        }
            
            



           
        
        
    
    
}


        
      

        