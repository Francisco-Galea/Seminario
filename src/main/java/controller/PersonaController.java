package controller;

import service.PersonaService;
import dto.request.PersonaRequestDTO;
import dto.response.PersonaResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api_seminario/personas")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping
    public ResponseEntity<PersonaResponseDTO> guardarPersona(@RequestBody PersonaRequestDTO personaRequestDTO) {
        PersonaResponseDTO savedPersona = personaService.guardarPersona(personaRequestDTO);
        return new ResponseEntity<>(savedPersona, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PersonaResponseDTO>> obtenerTodasLasPersonas() {
        List<PersonaResponseDTO> personas = personaService.obtenerTodasLasPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}