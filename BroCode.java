import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


public class BroCode{
    public static void main(String [ ] args){
        Car car=new Car();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.isRunning);
        car.start();

        Student kid1=new Student("John",false, 0, 0);
        System.out.println(kid1.name);
        kid1.fuck("Sarah");


        Users user1=new Users("spongebob");
        Users user2 = new Users("ghochu","pstar@awol.com");
        System.out.println(user1.username);
        System.out.println(user2.username+" "+user2.email);
        }
    
        

    }
 
    
    
      



    
