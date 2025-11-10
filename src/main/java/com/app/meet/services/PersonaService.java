package com.app.meet.services;

import com.app.meet.data.PersonaRepository;
import com.app.meet.models.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas(){
        return  personaRepository.findAll();
    }
}
