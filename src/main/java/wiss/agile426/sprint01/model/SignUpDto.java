package wiss.agile426.sprint01.model;

public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;

    private UserRole role;

    //SETTER
    public void setUsername(String username) {
        this.username = username;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(UserRole role){
        this.role = role;
    }


    //GETTER
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    public UserRole getRole(){
        return role;
    }
}
