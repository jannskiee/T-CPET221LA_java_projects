// Input the name and age of the student and display its values. A class Student has two encapsulated variables,
// stdName that contains the student’s name, and stdAge that contains the age of the student.
// Draw the UML diagram and perform its Java code. Use studentA as an object of the class.

public class StudentOne {
    private String stdName;
    private int stdAge;

    StudentOne(String stdName, int stdAge) {
        this.stdName = stdName;
        this.stdAge = stdAge;
    }

    public String getstdName() {
        return stdName;
    }

    public int getstdAge() {
        return stdAge;
    }
}
