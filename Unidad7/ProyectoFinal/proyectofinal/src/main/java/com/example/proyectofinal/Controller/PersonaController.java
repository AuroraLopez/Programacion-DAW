package com.example.proyectofinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectofinal.Model.Persona;
import com.example.proyectofinal.Service.PersonaService;

import org.springframework.web.bind.annotation.CrossOrigin;

// Permitimos el acceso al frontend
@CrossOrigin(origins = "http://localhost:8080")
// Lo indicamos como controlador Rest (devuelve datos json)
@RestController()
// Indicamos donde responden los datos json
@RequestMapping("/persona")
public class PersonaController {
    // Inyectamos de forma automática la clase Servicio para no crear el objeto
    @Autowired
    PersonaService service;

     // Para poder crear objetos persona
    @PostMapping
    public ResponseEntity<Persona> crear(@RequestBody Persona persona) {
        Persona creado = service.crear(persona); // Para que se inserten en la base de datos
        // Devuelve una respuest http
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(creado);
    }
    
    // READ - listar las personas (en este caso solo 1)
    @GetMapping
    public List<Persona> listar() {
        return service.listar();
    }
}
