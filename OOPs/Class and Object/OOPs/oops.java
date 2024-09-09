class Student { // private class
    String name;
    int age;

    public void StudentInfo() {
        System.out.println(this.name); // this keyword refers to the current object in a method or constructor.
        System.out.println(this.age);
    }

    Student() { // non perametrized constructor
    }

    Student(String name, int age) { // perametrized constructor
        this.name = name;
        this.age = age;
    }

    Student(Student s2) { // Copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class oops { // public class
    public static void main(String args[]) { // main function
        Student s1 = new Student(); // new keyword make a object in heep memory and store all object data
                                    // from their
        s1.name = "Rahul";
        s1.age = 20;

        Student s2 = new Student(s1); // copy properties
        s2.StudentInfo();
    }
}

// in java we dont make distructor because java have automatic garbage collector
