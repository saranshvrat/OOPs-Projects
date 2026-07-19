package Models;

public class User {

    private String id;
    private String name;
    private String phone;
    private String email;

    public User(String id, String name, String phone, String email){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    };

    public String getID()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getPhone()
    {
        return this.phone;
    }
    public String getEmail()
    {
        return this.email;
    }
}
