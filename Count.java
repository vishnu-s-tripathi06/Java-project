import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a larger number: ");
        int num=input.nextInt();
        System.out.print("Enter the digit you want to count: ");
        int digit = input.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if (rem==digit){
                count++;
            }
            num=num/10;

        }
        System.out.println(count);
    }
}
