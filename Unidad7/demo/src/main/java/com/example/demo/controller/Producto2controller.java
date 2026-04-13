package com.example.demo.controller;

import java.util.ArrayList;
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

import com.example.demo.model.Producto2;
import com.example.demo.service.ProductoService;

@RestController ()
@RequestMapping("/productos2")
public class Producto2controller {

    @Autowired
    ProductoService service;

    // CREATE
    @PostMapping
    public ResponseEntity<Producto2> crear(@RequestBody Producto2 producto) {
        Producto2 creado = service.crear(producto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(creado);
    }

    // READ - listar todos
    @GetMapping
    public List<Producto2> listar() {
        return service.listar();
    }

    // READ - buscar por id
    @GetMapping("/{id}")
    public Producto2 buscar(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Producto2 actualizar(
            @PathVariable int id,
            @RequestBody Producto2 producto) {

        return service.actualizar(id, producto);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id) {
        return service.eliminar(id);
    }
}
