import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer=0;
        System.out.print("Enter a Number: ");
        int num=input.nextInt();
        while(num>0){
            int remainder=num%10;
            num/=10;
            answer=answer*10+remainder;
        }
    System.out.print(answer);

    }
}