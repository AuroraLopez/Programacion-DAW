package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto2;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    // CREATE
    public Producto2 crear(Producto2 producto) {
        return repository.save(producto); // JPA asigna ID automáticamente
    }

    // READ - obtener todos
    public List<Producto2> listar() {
        return repository.findAll();
    }

    // READ - obtener por id
    public Producto2 buscarPorId(long id) {
        return repository.findById(id).orElse(null);
    }

    // UPDATE
    public Producto2 actualizar(long id, Producto2 productoActualizado) {
        Producto2 existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setName(productoActualizado.getName());
            existente.setPrecio(productoActualizado.getPrecio());
            existente.setImagen(productoActualizado.getImagen());
            return repository.save(existente);
        }
        return null; // no existe
    }

    // DELETE
    public String eliminar(long id) {
        Producto2 existente = repository.findById(id).orElse(null);
        if (existente != null) {
            repository.deleteById(id);
            return "Producto " + id + " eliminado";
        }
        return "Producto " + id + " no encontrado";
    }
}