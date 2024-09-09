
class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Kanishk";
        Student.school = "SAITM"; // we can access with class name if this is static
        System.out.println(student1.name + " goes to " + Student.school);
    }
}
