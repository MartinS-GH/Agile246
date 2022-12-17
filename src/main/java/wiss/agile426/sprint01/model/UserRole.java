package wiss.agile426.sprint01.model;


import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String role;

    //SETTER
    public void setId(int id) {
        this.id = id;
    }

    public void setRole(String role){
        this.role=role;
    }

    //GETTER

    public int getId() {
        return id;
    }

    public String getRole(){
        return role;
    }
}
