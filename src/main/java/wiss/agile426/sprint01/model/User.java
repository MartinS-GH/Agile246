package wiss.agile426.sprint01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

<<<<<<< Updated upstream
    @Column(name = "name", length = 24)
    private String name;
=======
<<<<<<< HEAD
    @Column(name = "first_name",nullable = false, length = 24)
    private String firstName;
=======
    @Column(name = "name", length = 24)
    private String name;
>>>>>>> b0e28db86ed179270ffd093de3048c46b1a1740c
>>>>>>> Stashed changes

    @Column(name = "username", nullable = false, length = 24)
    private String username;


    @Column(name = "email", unique = true, length = 55)
    private String eMail;


<<<<<<< Updated upstream
    @Column(name = "password", nullable = false, length = 64)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
=======
<<<<<<< HEAD

    //GETTER
    public String getTelephonNumber() {
        return telephonNumber;
    }
    public String getEMail() {
        return eMail;
    }

    public String getFirstName() {
        return firstName;
>>>>>>> Stashed changes
    }

    public String getName() {
        return name;
    }
    public Integer getId() {
        return id;
    }

<<<<<<< Updated upstream
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
=======


    //SETTER
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public void setTelephonNumber(String telephonNumber) {
        this.telephonNumber = telephonNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
=======
    @Column(name = "password", nullable = false, length = 64)
    private String password;

    public String getPassword() {
        return password;
>>>>>>> Stashed changes
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
>>>>>>> b0e28db86ed179270ffd093de3048c46b1a1740c
    }


    public void setId(Integer id) {
        this.id = id;
    }

}