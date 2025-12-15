package Introduction;

public class OOP_Intro {
    public static void main(String[] args) {
        //creating an object
        Student s1 = new Student();

        // accessing the variables
        s1.name = "abhi aditya";
        s1.rollNo = 5;
        s1.mathsMarks = 57;

        //printing
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.mathsMarks);

        //accessing the constructor
        Student s2 = new Student(6, "abhi", 67.5f);

        //printing
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.mathsMarks);

        // calling a function
        s2.greetings();

        //initializing copy constructor
        Student s3 = new Student(s1);

        // printing
        System.out.println(s3.name);
        System.out.println(s3.rollNo);
        System.out.println(s3.mathsMarks);
    }
}