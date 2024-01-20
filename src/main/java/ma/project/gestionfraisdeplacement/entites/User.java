package ma.project.gestionfraisdeplacement.entites;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 15)
    private String nom;
    @Column(nullable = false, length = 15)
    private String prenom;
    @Column(nullable = false, length = 15)
    private String email;
    @Column(nullable = false, length = 15)
    private String cin;
    @Column(nullable = false, length = 15)
    private String login;
    @Column(nullable = false, length = 15)
    private String password;
    @Column(nullable = false, length = 15)
    private String role;

}
