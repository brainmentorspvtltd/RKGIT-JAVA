/*
 * String - It is a collection of chars
 * String is a predefine class in Java
 * String behave like Data Type. e.g String Literal Way
 * String is a final class so now one can inherit this class
 * String uses String Pool Concept
 * String Object are Immutable
 * String objects can be created in 2 ways
 * a) String Literal b) new String
 */
public class StringDemo {
    public static void main(String[] args) {
        int x = 10; // int literal
        // String Literal
        String name = "Amit"; // Internally use 
        String name2 = "Amit"; //0
        System.out.println(name == name2); // true
        // How many objects can be created (1 or 0)
        //String name = "Amit".intern();
        String name3 = new String("Amit");
        System.out.println(name == name3); // false
        String name4 = new String("Amit").intern();
        System.out.println(name == name4); // true


    }
}
