public class Main {
    public static void main(String[] args) {
        // string
        String name = "Abhi";
        // String - class; name - reference variable; "Abhi" - object created inside string pool;

        // Creating a new String object outside String Pool
        String name1 = new String("Abhi");
        String name2 = new String("Abhi");

        // Comparison of String
        
        // == method - checks whether values are same and both ref. variables are pointing to same objects
        System.out.println(name1 == name2); // false
        // as they are different objects

        // .equals method - only checks value of the strings
        System.out.println(name1.equals(name2)); // true
    }
}