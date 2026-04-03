import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean is_prime=true;
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        int c=2;
        
        if (num<=1){
            System.out.println("Not prime. it's one");
            return;
        }
        while (c<=Math.sqrt(num)){
            
            if (num%c==0){
                System.out.println("Not prime");
                is_prime=false;
                break;
            }
            c++;
        }
        if (is_prime){
            System.out.print("prime number.");
        }
            
    }
}
             
               
               

        
                
                
            
