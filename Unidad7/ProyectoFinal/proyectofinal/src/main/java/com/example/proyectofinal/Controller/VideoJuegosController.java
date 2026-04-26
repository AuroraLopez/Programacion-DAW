package com.example.proyectofinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectofinal.Model.VideoJuegos;
import com.example.proyectofinal.Service.VideoJuegoService;

import org.springframework.web.bind.annotation.CrossOrigin;

// Permitimos el acceso al frontend
@CrossOrigin(origins = "http://localhost:8080")
// Lo indicamos como controlador Rest (devuelve datos json)
@RestController()
// Indicamos donde responden los datos json
@RequestMapping("/videojuegos")
public class VideoJuegosController {
    // Inyectamos de forma automática la clase Servicio para no crear el objeto
    @Autowired
    VideoJuegoService service;

    // Para poder crear objetos persona
    @PostMapping
    public ResponseEntity<VideoJuegos> crear(@RequestBody VideoJuegos videojuego) {
        VideoJuegos creado = service.crear(videojuego); // Para que se inserten en la base de datos
        // Devuelve una respuest http
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(creado);
    }

    // READ - listar todos
    @GetMapping
    public List<VideoJuegos> listar() {
        return service.listar();
    }

    // Función para buscar por titulo
    @GetMapping("/buscar/titulo/{titulo}")
    public List<VideoJuegos> buscarPorTitulo(@PathVariable String titulo) {
        return service.buscarPorTitulo(titulo);
    }

    // Función para buscar por autor
    @GetMapping("/buscar/autor/{autor}")
    public List<VideoJuegos> buscarPorAutor(@PathVariable String autor) {
        return service.buscarPorAutor(autor);
    }

    // Función para buscar por precios
    @GetMapping("/buscar/precios")
    public List<VideoJuegos> buscarPorPrecios(@RequestParam double min, @RequestParam double max) {
        return service.buscarEntrePrecios(min, max);
    }

    // Función para actualizar
    @PutMapping("/{id}")
    public VideoJuegos actualizar(
            // Obtiene la id
            @PathVariable int id,
            // Obtiene todo el contino del json 
            @RequestBody VideoJuegos videojuego) {
            // Llama a la función de servicio para actualizar
        return service.actualizar(id, videojuego);
    }

    // Función para borrar con la id
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id) {
        return service.eliminar(id);
    }
}
