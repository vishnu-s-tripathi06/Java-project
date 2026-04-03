import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // // float num=input.nextInt();
        // System.out.println(num);
        int num=(int) (45.43f);
        System.out.println(num);
        int a=257;
        byte b=(byte)(a);//256/257
        System.out.println(b);
        
    }
}
