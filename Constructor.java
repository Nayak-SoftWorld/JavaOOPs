class Student {
    String name;
    int age;

    public void printStdInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non-Parameterlized Constructor
    // Student() {
    // System.out.println("Student named Constructor is Called.");
    // }

    // Parameterlized Constructor
    // Student(String name, int age) {
    // this.name = name; // this.name --> object name || name --> parameter
    // this.age = age; // this.age --> object age || age --> parameter
    // }

    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Student1";
        s1.age = 21;

        // Student s1 = new Student("Charry", 21);
        // s1.printStdInfo();

        Student s2 = new Student(s1); // s1 properties coppied by s2
        s2.printStdInfo();

    }
}
