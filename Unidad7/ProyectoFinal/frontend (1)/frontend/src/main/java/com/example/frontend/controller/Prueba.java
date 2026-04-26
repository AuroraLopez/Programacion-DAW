package com.example.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Prueba {
    // Mapeamos el home para que devuelva la página home.html
    @GetMapping("/")
    public String inicio(){
        return "home";
    }

    // Mapeamos el catalogo devolviendo la página index.html
    @GetMapping("/catalogo")
    public String catalogo(){
        return "index";
    }

    // Mapeamos la página edición para que devuelva el index.html
    @GetMapping("/ediccion")
    public String ediccion(){
        return "gestion";
    }

    // Mapeamos el curriculum para que devuelva el cv.html
    @GetMapping("/cv")
    public String cv(){
        return "cv";
    }
}
