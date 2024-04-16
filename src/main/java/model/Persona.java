package model;

import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;


@Entity
@Builder
@Table(name = "personas")
@Getter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String documento;
    private String email;

}