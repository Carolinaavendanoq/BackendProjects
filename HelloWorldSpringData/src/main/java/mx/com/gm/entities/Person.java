package mx.com.gm.entities;

import jakarta.persistence.*;
import lombok.Data;


// Métodos get y set para cada atributo
@Data
@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerson;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

}
