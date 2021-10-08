package in.samanvitha.unit_1.part_3.static_;

public class Student {
    int rollno;
    String name;
    static String college = "BITS";

    Student( int r, String n ) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main( String args[] ) {
        Student s1 = new Student(111, "Aryan");
        Student s2 = new Student(222, "Karan");

        s1.display();
        s2.display();
    }
}
