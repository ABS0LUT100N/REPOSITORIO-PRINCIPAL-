package com.example.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todolist.model.Tarea;
import com.example.todolist.repository.CategoriaRepository;
import com.example.todolist.repository.TareaRepository;

@Controller
@RequestMapping("/tareas")
public class TareaController {
    @Autowired
    private TareaRepository tareaRepo;
    @Autowired
    private CategoriaRepository categoriaRepo;

    @GetMapping
    public String listar(Model model){
        model.addAttribute("tareas", tareaRepo.findAll());
        return"tareas/lista";
    }

    @GetMapping("/nueva")
    public String nueva(Model model){
        model.addAttribute("tarea", new Tarea());
        model.addAttribute("categorias", categoriaRepo.findAll());
        return"tareas/formulario";   
    }
    @PostMapping
    public String guardar(@ModelAttribute Tarea tarea){
        tareaRepo.save(tarea);
        return"redirect:/tarea";
    }
}