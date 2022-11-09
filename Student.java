// class- Noun
//import java.lang.*;
// Encapsulation = Binding Data Members + Methods into Single Unit
//  and this unit is called class.
// Data Hiding
class Student{
    // Members
    // Instance Members
    private int rollno;
    private String name;
    private int marks[] = new int[3];
    private String course;
    
    public void takeInput(int rollno, String name, int marks[], String course){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    public void print(){
        // this 
        System.out.println(this.rollno);
        System.out.println(name);
        System.out.println(course);
    }
}