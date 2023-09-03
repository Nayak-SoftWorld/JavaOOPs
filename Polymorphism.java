class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Polymorphism of printInfo 
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nayak";
        s1.age = 21;
        // s1.printInfo(); // this function calling print all the information about
        // the student that is being .

        s1.printInfo(s1.name, s1.age); // this provide a perticular information

    }
}
