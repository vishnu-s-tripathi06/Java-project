import java.util.Arrays;
import java.util.Scanner;
public class arrays {
      //varargs 
        static int add(int... numbers){
        int sum=0;
        for (int num:numbers){
            sum+=num;
            
        }
        return sum;

    }
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] fruits={"apple","orange","banana","mango"};
        int[] val={2,3,4,54,5,5};
        for (int i=0;i<val.length;i++){
            System.out.println(val[i]);
        }
        System.out.println(val.length);

        //Enhanced for loop
        for (String fruit:fruits){
            System.out.println(fruit);
        }
        System.out.printf("\n");
        //sorting arrays
        Arrays.sort(fruits);
        System.out.println("Sorted array.");
        for (String fruit:fruits){
            System.out.println(fruit);
        }
        //taking input in an array with for loop
        String[] foods=new String[4];
        for (int i=0;i<foods.length;i++){
            System.out.print("Enter a food: ");
            foods[i]=scanner.nextLine();
        }
        for (String food: foods){
            System.out.println(food);
        }
        String target="orange";
        for (int i=0;i<fruits.length;i++){
            if (fruits[i].equals(target)){
                System.out.print("found");
            }
        }
      

    }
}
