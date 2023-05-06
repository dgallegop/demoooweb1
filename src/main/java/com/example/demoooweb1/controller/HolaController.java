package com.example.demoooweb1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dgall
 */
@RestController
@RequestMapping("/saludo")
public class HolaController {
    @GetMapping("/hola")
    public String saludo(){
        return "Hola a todos";
    }
}
