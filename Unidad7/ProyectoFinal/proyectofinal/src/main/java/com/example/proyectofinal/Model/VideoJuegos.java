package com.example.proyectofinal.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VideoJuegos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String creador;
    private Date fecha_lanzamiento;
    private String genero;
    private String mododejuego;
    private String pegi;
    private double precio;
    
    // Constructor por defecto
    public VideoJuegos(){

    }

    // Constructor con los campos
    public VideoJuegos(Long id, String titulo, String creador, Date fecha_lanzamiento, String genero,
            String mododejuego, String pegi, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.creador = creador;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.genero = genero;
        this.mododejuego = mododejuego;
        this.pegi = pegi;
        this.precio = precio;
    }

    // Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMododejuego() {
        return mododejuego;
    }

    public void setMododejuego(String mododejuego) {
        this.mododejuego = mododejuego;
    }

    public String getPegi() {
        return pegi;
    }

    public void setPegi(String pegi) {
        this.pegi = pegi;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }
}
