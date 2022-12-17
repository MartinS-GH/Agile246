package wiss.agile426.sprint01.model;

import jakarta.persistence.*;

import javax.management.relation.Role;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", length = 24)
    private String name;

    @Column(name = "username", nullable = false, length = 24)
    private String username;


    @Column(name = "email", unique = true, length = 55)
    private String eMail;


    @Column(name = "password", nullable = false, length = 64)
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", nullable = false)
    private UserRole role;



    //SETTER
    public void setId(Integer id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String eMail) {
        this.eMail = eMail;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(UserRole role){
        this.role = role;
    }


    //GETTER
    public String getEmail() {
    return eMail;
}
    public String getUsername() {
        return username;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public UserRole getRole(){
        return role;
    }
}