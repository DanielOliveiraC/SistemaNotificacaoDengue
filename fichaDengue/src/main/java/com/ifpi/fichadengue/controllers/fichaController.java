package com.ifpi.fichadengue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class fichaController {

    @GetMapping("/notificar")
    public String notificar() {
        return "notify";
    }
}
