package com.team5.salas_service.controller;


import com.team5.salas_service.model.service.ISalasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salas-service")
public class SalasRestController {
    @Autowired
    private ISalasService salasService;

    @GetMapping("/hola/{nombre}")
    public String holaMundo(@PathVariable("nombre") String nombre){

        return "Hola " + nombre;
    }
}
