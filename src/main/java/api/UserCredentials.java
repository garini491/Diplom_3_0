package api;

public class UserCredentials {
    private String email;
    private String password;

    public UserCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserCredentials() {
    }
    public static UserCredentials from(User user) {
        return new UserCredentials(user.getEmail(), user.getPassword());
    }

}

