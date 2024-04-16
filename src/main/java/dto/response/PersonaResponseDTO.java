package dto.response;

import lombok.Builder;

@Builder
public class PersonaResponseDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String documento;
    private String email;
}