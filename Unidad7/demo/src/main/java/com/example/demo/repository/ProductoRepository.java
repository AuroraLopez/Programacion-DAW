package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Producto2;

@Repository
public interface ProductoRepository extends JpaRepository<Producto2, Long> {
 // Aquí puedes definir métodos personalizados si quieres pero si usas nombres de la entidad se hacen automáticos
 // Ejemplo:List<Producto> findByName(String name); o List<Producto> findByPrecioBetween(double min, double max);
}
