class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newSkool";
    }
}

public class Static_keyword {
    public static void main(String[] args) {
        Student.school = "skool";
        Student student1 = new Student();
        student1.name = "Student";
        System.out.println(student1.school);
    }
}
