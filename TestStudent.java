// Testing
public class TestStudent {
    public static void main(String[] args) {
        Student ram = new Student(); // Local Var
        int m [] = {90,88,77};
        ram.rollno=-1001;
        ram.course = "";
        //ram.takeInput(1001, "Ram", m,"Java");
        ram.print();
        Student shyam = new Student(); // Local Var
        shyam.takeInput(1002, "Shyam", m,"JavaScript");
        shyam.print();

        // System.out.println(ram.rollno);
        // System.out.println(ram.name);
        // System.out.println(ram.course);
        // ram.rollno = 1001;
        // ram.name = "Ram Kumar";
        // ram.course = "Java";
        
       // int x = 100 ;  // What is x
        // x is a variable
    }
}
