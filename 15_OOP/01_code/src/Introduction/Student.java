package Introduction;

//creating a class
class Student{
    String name;
    int rollNo;
    float mathsMarks;

    //default constructor
    Student(){
//        this.rollNo = 0;
//        this.name = null;
//        this.mathsMarks = 0.0f;
        this (0, null, 0.0f);
    }

    // copy constructor
    Student(Student s){
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.mathsMarks = s.mathsMarks;

    }

    // parameterised constructor
    Student(int roll, String  name, float  mathMark){
        this.rollNo = roll;
        this.name = name;
        this.mathsMarks = mathMark;
    }

    void greetings(){
        System.out.printf("hello!! %s", this.name);
    }
}