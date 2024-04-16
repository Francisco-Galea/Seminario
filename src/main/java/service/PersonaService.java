package service;

import dto.request.PersonaRequestDTO;
import dto.response.PersonaResponseDTO;
import mapper.PersonaMapper;
import model.Persona;
import repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;

    public PersonaService(PersonaRepository personaRepository, PersonaMapper personaMapper) {
        this.personaRepository = personaRepository;
        this.personaMapper = personaMapper;
    }

    public PersonaResponseDTO guardarPersona(PersonaRequestDTO personaRequestDTO) {
        Persona persona = personaMapper.convertToEntity(personaRequestDTO);
        persona = personaRepository.save(persona);
        return personaMapper.convertToResponseDTO(persona);
    }

    public List<PersonaResponseDTO> obtenerTodasLasPersonas() {
        List<Persona> personas = personaRepository.findAll();
        return personas.stream()
                .map(personaMapper::convertToResponseDTO)
                .collect(Collectors.toList());
    }
}