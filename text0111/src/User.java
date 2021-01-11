public class User {
    private int id;
    private String passwrod;
    User()
    {
        this("123456");
    }

    public User(String passwrod) {
        this.passwrod = passwrod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswrod() {
        return passwrod;
    }

}