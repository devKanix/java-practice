class Account {
    public String name;
    protected String email;
    private String password;

    // use getters & setters for access private things
    // getters
    public String getPassword() {
        return this.password;
    }

    // setters
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class AccessModifilers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "John Doe";
        account1.email = "johndoe@gmail.com";
        account1.setPassword("123456");
        System.out.println(account1.getPassword()); // we only access private things like this

    }
}
