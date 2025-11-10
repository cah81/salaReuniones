package com.app.meet.controllers;

import com.app.meet.models.Persona;
import com.app.meet.models.Reunion;
import com.app.meet.services.PersonaService;
import com.app.meet.services.ReunionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reuniones")
public class ReunionRestController {

    private ReunionService reunionService;

    public ReunionRestController(ReunionService reunionService) {
        this.reunionService = reunionService;
    }
    
    @GetMapping
    public List<Reunion> getAllPersonas(){
        return reunionService.getAllReuniones();
    }
}
