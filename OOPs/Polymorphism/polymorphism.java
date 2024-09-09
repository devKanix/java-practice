
//poly = many.
// morphism = forms. 
// when we do a work in many forms called polymorphism.

// polymorphism have 2 types:
// 1. funtion-overloacding : compiletime polymorphism = the relationship between the definition of different functions and their function calls, is determined during the compile-time
// 2. funtion-overriding : runtime polymorphism =  the compiler resolves the object at run time and then it decides which function call should be associated with that object.

//1.COMPILE-TIME
class Student { // private class
    String name;
    int age;

    public void StudentInfo(String name) {
        System.out.println(name);
    }

    public void StudentInfo(int age) { // same name many funtion.
        System.out.println(age);
    }

    public void StudentInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kanishk";
        s1.age = 20;
        s1.StudentInfo(s1.name, s1.age);
    }
}
