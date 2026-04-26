package com.example.proyectofinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.Model.VideoJuegos;
import com.example.proyectofinal.Repository.VideoJuegosReporsitory;

@Service
public class VideoJuegoService {
    // Inyectamos de forma automática la clase Repositorio para no crear el objeto
    @Autowired
    private VideoJuegosReporsitory repository;

    // Guarda un nuevo videojuego en la base de datos
    public VideoJuegos crear(VideoJuegos videojuego) {
        return repository.save(videojuego); // JPA asigna ID automáticamente
    }

    // Devuelve la lista completa de videojuegos
    public List<VideoJuegos> listar() {
        return repository.findAll();
    }

    // Busca un videojuego por su ID
    public VideoJuegos buscarPorId(long id) {
        return repository.findById(id).orElse(null);
    }

    // Busca videojuegos por titulo sin portar mayusculas
    public List<VideoJuegos> buscarPorTitulo(String titulo) {
        return repository.findByTituloContainingIgnoreCase(titulo);
    }

    // Busca videojuegos por creador sin portar mayusculas
    public List<VideoJuegos> buscarPorAutor(String autor) {
        return repository.findByCreadorContainingIgnoreCase(autor);
    }

    // Busca videojuegos por medio de dos precios
    public List<VideoJuegos> buscarEntrePrecios(double min, double max){
        return repository.findByPrecioBetween(min, max);
    }

    // Actualiza los videojuegos guardandolos previamente en una lista encontrandolos por id
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

    // Elimina usando el id para borrar
    public String eliminar(long id) {
        VideoJuegos existente = repository.findById(id).orElse(null);
        // Condición para ver si existe
        if (existente != null) {
            repository.deleteById(id);
            return "Producto " + id + " eliminado";
        }
        return "Producto " + id + " no encontrado";
    }
}