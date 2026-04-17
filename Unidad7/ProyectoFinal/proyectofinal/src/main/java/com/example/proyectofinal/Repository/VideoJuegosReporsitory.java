package com.example.proyectofinal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyectofinal.Model.VideoJuegos;

@Repository
public interface VideoJuegosReporsitory extends JpaRepository<VideoJuegos, Long> {
    List<VideoJuegos> findByTituloContainingIgnoreCase(String titulo);

    List<VideoJuegos> findByCreadorContainingIgnoreCase(String creador);

    List<VideoJuegos> findByPrecioBetween(double min, double max);

}

