package service;

import model.Persona;
import repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardarPersona(Persona persona) {

        return personaRepository.save(persona);

    }

    public List<Persona> obtenerTodasLasPersonas() {

        return personaRepository.findAll();

    }

    public void eliminarPersona(Long id) {

        personaRepository.deleteById(id);

    }
}