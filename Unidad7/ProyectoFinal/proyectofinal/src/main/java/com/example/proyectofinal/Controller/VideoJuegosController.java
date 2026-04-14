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
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectofinal.Model.VideoJuegos;
import com.example.proyectofinal.Service.VideoJuegoService;

@RestController ()
@RequestMapping("/videojuegos")
public class VideoJuegosController {
        @Autowired
    VideoJuegoService service;

    // CREATE
    @PostMapping
    public ResponseEntity<VideoJuegos> crear(@RequestBody VideoJuegos videojuego) {
        VideoJuegos creado = service.crear(videojuego);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(creado);
    }

    // READ - listar todos
    @GetMapping
    public List<VideoJuegos> listar() {
        return service.listar();
    }

    // READ - buscar por id
    @GetMapping("/{id}")
    public VideoJuegos buscar(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public VideoJuegos actualizar(
            @PathVariable int id,
            @RequestBody VideoJuegos videojuego) {

        return service.actualizar(id, videojuego);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id) {
        return service.eliminar(id);
    }
}
