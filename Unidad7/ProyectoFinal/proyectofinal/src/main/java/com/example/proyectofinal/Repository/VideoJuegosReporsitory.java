package com.example.proyectofinal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyectofinal.Model.VideoJuegos;

// La marcamos como repositorio, 
@Repository
// Esta interfaz hereda de JpaRepository, lo que nos da automáticamente
public interface VideoJuegosReporsitory extends JpaRepository<VideoJuegos, Long> {
    // Busca videojuegos por título sin importar si está en mayúsculas o minúsculas
    List<VideoJuegos> findByTituloContainingIgnoreCase(String titulo);

    // Busca videojuegos por creador sin importar si está en mayúsculas o minúsculas
    List<VideoJuegos> findByCreadorContainingIgnoreCase(String creador);

     // Busca videojuegos por medio de dos precios
    List<VideoJuegos> findByPrecioBetween(double min, double max);
}

