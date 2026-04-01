import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args){
        System.out.print("Enter a day between 1-7: ");
        Scanner scanner=new Scanner(System.in);
        
        int day=scanner.nextInt();
        boolean go=(day<=7 && day>=1)?true:false;
        if (go){
            switch (day){
            case 1,2,3,4,5-> System.out.println("It is a weekday☹️");
            case 6,7->System.out.println("It is a weekend😊");
        }
        }
        else{
            System.out.print("try again.");
        }
    }


}

        
        
            
            

