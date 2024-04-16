package dto.request;

import lombok.Data;

@Data
public class PersonaRequestDTO {
    private String nombre;
    private String apellido;
    private String documento;
    private String email;

}