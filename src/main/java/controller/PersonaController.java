package controller;

import model.Persona;
import service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("personas")

public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona guardarPersona(@RequestBody Persona persona) {

        return personaService.guardarPersona(persona);

    }

    @GetMapping
    public List<Persona> obtenerTodasLasPersonas() {

        return personaService.obtenerTodasLasPersonas();

    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id) {

        personaService.eliminarPersona(id);

    }

}