public class Student {
    
    String name;
    boolean isEnrolled;
    double gpa;
    int age;
    // Constructor-> A special method to initialize objects
    //               You can pass arguments to a constructor
    //               and setup initial values
    Student(String name,boolean isEnrolled,double gpa,int age){
        this.age=age;
        this.name=name;
        this.isEnrolled=isEnrolled;
        this.gpa=gpa;

    }
    void fuck(String person){
      
        System.out.println(this.name+" is fucking "+person);
    }
    
}
