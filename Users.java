public class Users {
    String username;
    String email;
    int age;
    /*overloaded constructors->Allow clas to hava multiple constructors
                               with different parameters lines
                               Enable objects to be initialized in various ways */
                               
    Users(){
        this.username="guest";
        this.age=0;
        this.email="not provided";
    }
    Users(String username){
        this.username=username;
        this.email="not provided";
        this.age=0;
    }
    Users(String username,String email){
        this.username=username;
        this.age=0;
        this.email=email;
    }
}
