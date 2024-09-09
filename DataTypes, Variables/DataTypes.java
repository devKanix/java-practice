public class DataTypes {
    public static void main(String[] args) {
        // Primitives
        boolean a = true; // size = 8 bits, range = true/false
        byte b = 127; // size = 8 bits, range = -127 to 127
        char c = 'a'; // size = 16 bits, range = 0 to 255
        short d = 10; // size = 16 bits, range = -32,768 to 32,767
        int e = 100; // size = 32 bits, range = -2,147,483,648 to 2,147,483,647
        long f = 1000L; // size = 64 bits, range = -9,223,372,036,854,775,808 to
                        // 9,223,372,036,854,775,807
        float g = 10.5f; // size = 32 bits, range = upto 7 decimal digits
        double h = 10.5; // size = 64 bits, range = upto 16 decimal digits

        System.out.println("boolean: " + a);
        System.out.println("byte: " + b);
        System.out.println("char: " + c);
        System.out.println("short: " + d);
        System.out.println("int: " + e);
        System.out.println("long: " + f);
        System.out.println("float: " + g);
        System.out.println("double: " + h);

        // Non-Primitives
        // 1.String = size = 2 bytes, range = upto 2 billion
        String i = "Hello";
        System.out.println("String: " + i);
        // 2. class
        // 3. object
        // 4. Interface
        // 5. Array
    }
}
