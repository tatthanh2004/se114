public class Account {
    private String username;
    private String password;
    private String name;
    private String description;

    public Account(String username, String password, String name, String description) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}