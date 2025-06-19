package org.bedu.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MiPrimerController {

    // Endpoint accesible en: /helloworld
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Holaa Soy Dany";
    }
}
