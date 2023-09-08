package web.model;

public class User {
    private Long id;
    private String name;
    private String lastname;

    public User() {
    }
    public User(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastname = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void update(User user) {
        name = user.name;
        lastname = user.lastname;
    }
}
