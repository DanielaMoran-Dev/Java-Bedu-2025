package org.bedu.disney.controller;

import java.util.List;

import org.bedu.Disney.entity.Pelicula;
import org.bedu.Disney.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaController {

    @Autowired
    private PeliculaRepository repo;

    @GetMapping("/peliculas")
    public List<Pelicula> obtenerPeliculas() {
        return repo.findAll();
    }

    @PostMapping("/peliculas")
    public Pelicula crearPelicula(@RequestBody Pelicula nueva) {
        return repo.save(nueva);
    }
}
