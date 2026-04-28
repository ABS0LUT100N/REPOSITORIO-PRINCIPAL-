package com._D.Ejemplo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com._D.Ejemplo1.repository.PersonaRepository;

@Controller
public class PersonaController {
     @Autowired
    PersonaRepository personaRepository;

    @GetMapping({ "/listar"})
public String listar(Model model) {
    // Busca todos los registros en la BD y los guarda en la variable "personas"
    model.addAttribute("personas", personaRepository.findAll());
    
    return "listar"; // Retorna la vista listar.html
}
    
}
 