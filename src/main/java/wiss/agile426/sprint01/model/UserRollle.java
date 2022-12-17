package wiss.agile426.sprint01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "UserRolle")
public class UserRollle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    //SETTER
    public void setId(int id) {
        this.id = id;
    }
    public void setUser(User user){
        this.user = user;
    }


    //GETTER
    public int getId() {
        return id;
    }


}
