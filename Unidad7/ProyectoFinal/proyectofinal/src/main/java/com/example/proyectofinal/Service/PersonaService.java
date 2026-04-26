package com.example.proyectofinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.Model.Persona;
import com.example.proyectofinal.Repository.PersonaRepository;

@Service
public class PersonaService {
    // Inyectamos de forma automática la clase Repositorio para no crear el objeto
    @Autowired
    private PersonaRepository repository;
    // CREATE
    public Persona crear(Persona persona) {
        return repository.save(persona); // JPA asigna ID automáticamente
    }

    // READ - obtener todos
    public List<Persona> listar() {
        return repository.findAll();
    }
}