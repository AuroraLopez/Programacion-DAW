package com.example.proyectofinal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyectofinal.Model.VideoJuegos;

@Repository
public interface VideoJuegosReporsitory extends JpaRepository<VideoJuegos, Long> {
    List<VideoJuegos> findByTitulo(String titulo);
}

