import java.util.Scanner;

public class DataTypes {
    public static void main(){
        System.out.println("Not Java Wala Main");
    }
    // ...args - It is called var args (Java 1.5) (Variable Arguments)
    static public  void main(String ...args) {
        /*
         * Scanner is a predefine class in Java 
         * It act as a Buffer
         * For Input we use System.in
         */
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the First Number");
        int firstNumber = scanner.nextInt();// Fetch int from Buffer
        System.out.println("First Number is "+firstNumber);
        int x = 10; // Local Variable has to be initalize first before use
        System.out.println(x);
      // Java Wala Main
      // JRE Knows the Signature of this main
      System.out.println("I am the Java Wala Main");  
        main();
        scanner.close();
    }
}
