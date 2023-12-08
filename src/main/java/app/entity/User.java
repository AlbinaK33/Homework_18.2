package app.entity;



import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private boolean enabled;
}
