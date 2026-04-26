package com.example.proyectofinal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyectofinal.Model.Persona;

// La marcamos como repositorio, 
@Repository
// Esta interfaz hereda de JpaRepository, lo que nos da automáticamente
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}

