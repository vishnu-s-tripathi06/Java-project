import java.util.Scanner;
public class Calculator {
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double result=0;
        while (true){
            System.out.print("Enter a number: ");
            double num1=input.nextDouble();
            System.out.print("Enter a second number: ");
            double num2=input.nextDouble();
            System.out.println("Enter a operator: ");
            char operator=input.next().trim().charAt(0);
            switch (operator) {
                case '+':
                    result=num1+num2;
                    break;
            
                case '-':
                    result=(num1-num2);
                    break;
                case '*' , 'x','X':
                    result=(num2*num1);
                    break;
                case '/':
                    if (num2 != 0) {
                        result=(num1 / num2);
                    } 
                    else {
                        System.out.println("Cannot divide by zero");
                        continue;
                        }
                    break;
                    
                case '%':
                    if (num2 != 0) {
                        result=(num1 % num2);
                        
                       } 
                    else {
                        System.out.println("Cannot modulo by zero");
                        continue;
                        }
                        break;
                default:
                    System.out.println("Enter something");
                    continue;
    
            }
            System.out.println(result);

        }
        
       

      }

}
