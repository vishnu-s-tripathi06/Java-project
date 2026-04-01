public class StringMethods {
    public static void main(String[] args){
        String name="Calm With Vishnu";
        String email="CalmWithVishnu@gmail.com";
        System.out.println(name.toLowerCase());

        //returns the element at index 0
        System.out.println(name.charAt(0));

        //returns the index of this element
        System.out.println(name.indexOf("W"));

        //to check the length of string
        System.out.println(name.length());
        System.out.println(name.replace('C', '5'));

        //to check if your string contains a character
        System.out.println(name.contains("Calm"));

        System.out.println(name.equals("youtube"));
        //return the part of string between these index
        System.out.println(name.substring(0,5));
        //use case
        System.out.println(email.substring(email.indexOf("@")));
        






    }
}
