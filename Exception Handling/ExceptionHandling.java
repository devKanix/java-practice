
//Exception Handling = to manage and respond to unexpected or expected situations that can occur during program execution.
//5 Components of EX:-
//1. Try Block
//2. Catch Block
//3. Finally Block
//4. Throw
//5. Thows
public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(100 / 2);
        }
        myException();

    }

    static void myException() throws Exception {
        throw new Exception("Something is wrong....");
    }
}