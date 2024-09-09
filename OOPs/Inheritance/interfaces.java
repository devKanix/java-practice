interface Animal {
    int eyes = 2;

    void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore { // this is multiple inheritance but we cant use it in java we only use this
                                           // by interface only
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {

    }
}
