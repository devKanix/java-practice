
// Inheritance = one class is allowed to inherit the features(fields and methods) of another class.

// 4 types of inheritance.
// 1. Single level inheritance. (1 base and child class)
// 2. Multilevel inheritance. (1 base class connected levels to child class)
// 3. Hierarchical inheritance. (1 base class connected to multiple child class)
// 4. Hybrid inheritance. (upper 3 types and connected to each other)
// 5. mutiple inheritance. (only use in c++. In java we call "Interfaces")

//1. Single level
class Shape { // base class or parent class
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape { // sub class or child class
    // Triangle class inherit the Shape class property
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 2. multi level
class Shape2 { // base class or parent class
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle2 extends Shape { // sub class or child class
    // Triangle class inherit the Shape class property
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class EquiletralTriangle extends Triangle2 {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 3. Hierarchical
class Shape3 { // base class or parent class
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle3 extends Shape { // sub class or child class
    // Triangle class inherit the Shape class property
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class circle extends Shape3 {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class inheritance {
    public static void main(String[] args) {

    }

}
