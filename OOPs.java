class Pen {
    String color;// red,black,blue etc...
    String type;// gel or ball

    public void write() {
        System.out.println("Write Function is Called.");
    }

    public void printColor() {
        System.out.print("Color Function is Called." + " ");
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPs {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "red";
        // pen1.type = "solid";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ball";

        // pen1.write();

        // pen1.printColor();
        // pen2.printColor();
        Student s1 = new Student();
        s1.name = "Student1";
        s1.age = 20;
        s1.printInfo();
    }
}
