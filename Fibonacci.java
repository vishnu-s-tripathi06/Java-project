import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter No. of characters in fobonacci series you want: ");
        Scanner input=new Scanner(System.in);
        int end=input.nextInt();
        int a=0;
        int b=1;
        int c;
        for (int i=0; i<end;i++){
            System.out.printf("%d ",a);

            c=a+b;
            a=b;
            b=c;
        }
    }
}
            

