package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DemoController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "Hola desde Spring Boot");
        model.addAttribute("nombres", List.of("Ana", "Luis", "Pedro"));
        model.addAttribute("edad", 19);
        return "index";
    }

    @GetMapping("/ciclos/{id}")
    public String ciclo(@PathVariable String id, Model model) {
        model.addAttribute("ciclo", id);
        return "ciclo";
    }

    @GetMapping("/numeros/{id}")
    public String numero(@PathVariable int id, Model model) {
        model.addAttribute("numero", id);
        return "numero";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

}