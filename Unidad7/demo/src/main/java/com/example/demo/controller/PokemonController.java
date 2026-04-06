package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Pokemon;
import com.example.demo.service.PokemonService;

@Controller
public class PokemonController {
    @Autowired
    private PokemonService service;

     @GetMapping({"/pokemon"})
    public String mostrarPokemon(Model model) {
        ArrayList<Pokemon> pokemons=new ArrayList<>();
        Random r = new Random();
        int id =r.nextInt(1000)+1;
        Pokemon pokemon = service.obtenerPokemon(id);
        if (pokemon == null) {
            model.addAttribute("error", "No se pudo obtener el Pokémon");
            return "error"; // plantilla Thymeleaf error.html
        }
        pokemon.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
        pokemons.add(pokemon);
        model.addAttribute("pokemons", pokemons);
        return "pokemon"; // plantilla pokemon.html
    }
    @GetMapping({"/pokemon/{id}"})
    public String mostrarPokemon(@PathVariable(required = true) Integer id, Model model) {
        Pokemon pokemon = service.obtenerPokemon(id);
        if (pokemon == null) {
            model.addAttribute("error", "No se pudo obtener el Pokémon");
            return "error"; // plantilla Thymeleaf error.html
        }
        pokemon.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
        model.addAttribute("pokemon", pokemon);
        return "pokemonDetalle"; // plantilla pokemonDetalle.html
    }

    @GetMapping({"/pokemon/1generacion"})
    public String mostrarPokemon1generacion(Model model) {
        ArrayList<Pokemon> pokemons=new ArrayList<>(); 
        for (int i = 0; i <10; i++) {
            Random r = new Random();
            int id =r.nextInt(151)+1;
            Pokemon pokemon = service.obtenerPokemon(id);
            if (pokemon == null) {
                model.addAttribute("error", "No se pudo obtener el Pokémon");
                return "error"; // plantilla Thymeleaf error.html
            }
            pokemon.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
            pokemons.add(pokemon);
        }
        model.addAttribute("pokemons", pokemons);
        return "pokemon"; // plantilla pokemon.html
    }
    @GetMapping({"/pokemon/2generacion"})
    public String mostrarPokemon2generacion(Model model) {
        ArrayList<Pokemon> pokemons=new ArrayList<>(); 
        for (int i = 0; i <10; i++) {
            int id =(int)(Math.random() * (251 - 151 + 1) + 151);
            Pokemon pokemon = service.obtenerPokemon(id);
            if (pokemon == null) {
                model.addAttribute("error", "No se pudo obtener el Pokémon");
                return "error"; // plantilla Thymeleaf error.html
            }
            pokemon.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
            pokemons.add(pokemon);
        }
        model.addAttribute("pokemons", pokemons);
        return "pokemon"; // plantilla pokemon.html
    }
}
