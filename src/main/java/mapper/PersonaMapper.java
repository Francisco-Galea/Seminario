package mapper;

import dto.request.PersonaRequestDTO;
import dto.response.PersonaResponseDTO;
import model.Persona;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonaMapper {
    private final ModelMapper modelMapper;

    public PersonaMapper(ModelMapper modelMapper) {

        this.modelMapper = modelMapper;
    }

    public PersonaResponseDTO convertToResponseDTO(Persona persona) {

        return modelMapper.map(persona, PersonaResponseDTO.class);
    }

    public Persona convertToEntity(PersonaRequestDTO personaRequestDTO) {

        return modelMapper.map(personaRequestDTO, Persona.class);
    }
}