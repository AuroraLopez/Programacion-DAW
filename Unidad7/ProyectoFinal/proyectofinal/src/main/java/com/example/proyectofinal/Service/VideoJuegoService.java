package com.example.proyectofinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.Model.VideoJuegos;
import com.example.proyectofinal.Repository.VideoJuegosReporsitory;

@Service
public class VideoJuegoService {
    @Autowired
    private VideoJuegosReporsitory repository;

    // CREATE
    public VideoJuegos crear(VideoJuegos videojuego) {
        return repository.save(videojuego); // JPA asigna ID automáticamente
    }

    // READ - obtener todos
    public List<VideoJuegos> listar() {
        return repository.findAll();
    }

    // READ - obtener por id
    public VideoJuegos buscarPorId(long id) {
        return repository.findById(id).orElse(null);
    }

    // READ - obtener por titulo
    public List<VideoJuegos> buscarPorTitulo(String titulo) {
        return repository.findByTituloContainingIgnoreCase(titulo);
    }

    // READ - obtener por autor
    public List<VideoJuegos> buscarPorAutor(String autor) {
        return repository.findByCreadorContainingIgnoreCase(autor);
    }

    // READ - obtener por autor
    public List<VideoJuegos> buscarEntrePrecios(double min, double max){
        return repository.findByPrecioBetween(min, max);
    }

    // UPDATE
    public VideoJuegos actualizar(long id, VideoJuegos videojuegoActualizado) {
        VideoJuegos existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setTitulo(videojuegoActualizado.getTitulo());
            existente.setCreador(videojuegoActualizado.getCreador());
            existente.setFecha_lanzamiento(videojuegoActualizado.getFecha_lanzamiento());
            existente.setGenero(videojuegoActualizado.getGenero());
            existente.setMododejuego(videojuegoActualizado.getMododejuego());
            existente.setPegi(videojuegoActualizado.getPegi());
            existente.setPrecio(videojuegoActualizado.getPrecio());
            existente.setUrl(videojuegoActualizado.getUrl());
            return repository.save(existente);
        }
        return null; // no existe
    }

    // DELETE
    public String eliminar(long id) {
        VideoJuegos existente = repository.findById(id).orElse(null);
        if (existente != null) {
            repository.deleteById(id);
            return "Producto " + id + " eliminado";
        }
        return "Producto " + id + " no encontrado";
    }
}