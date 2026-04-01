import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        //creating scanner object
        Scanner scanner;
        scanner = new Scanner(System.in);

        //defining variables
        float length,width;
        System.out.print("Length of rectangel: ");
        
        //planting value of input in variable
        length=scanner.nextFloat();
        System.out.print("Width of rectangel: ");
        width=scanner.nextFloat();
        float area=length*width;
        System.out.println(area);
        scanner.close();

    }
}
