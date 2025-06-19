package org.bedu.mascotas.controller;

import java.util.LinkedList;
import java.util.List;
import org.bedu.mascotas.model.Mascota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    private List<Mascota> baseDatos = new LinkedList<>();

    @GetMapping("/mascotas")
    public List<Mascota> obtener() {
        return baseDatos;
    }

    @PostMapping("/mascotas")
    public Mascota agregar(@RequestBody Mascota nueva) {
        baseDatos.add(nueva);
        return nueva;
    }
}
