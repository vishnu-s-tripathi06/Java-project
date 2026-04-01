import java.util.Scanner;

public class countDown {
        public static void print(String text){
    System.out.print(text);
    }
    public static void println(String text){
    System.out.println(text);
    }

public static void main(String[] args) throws InterruptedException{
    Scanner scanner=new Scanner(System.in);
    println("Enter the No. of seconds for countdown.");
    int seconds=scanner.nextInt();
    for (int i=0;i<=seconds;i++){
        print("Pizza\n");
        Thread.sleep(1000);
    }
    scanner.close();
    
}
}

