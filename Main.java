import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the index");
    int num=input.nextInt();
    int a=0;
    int b=1;
    int c=0;
    for (int i=1;i<num;i++){
        c=a+b;

        a=b;
        b=c;

    }
    System.out.println(c);
    
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=input.nextInt();
        System.out.println("Etnera second number;  ");
        int num2=input.nextInt();
        System.out.println(num1+num2);
        }
    }
}

