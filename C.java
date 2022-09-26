public class C {
   public static void main(String[] args) {
    // String Literal
    String name = "Amit"; // Pool
    //String name = "Amit".intern();
    String name2 = "Amit";
    System.out.println(name == name2); // true
    String name3 = new String("Amit").intern();
    System.out.println(name == name3); // true

   } 
}
