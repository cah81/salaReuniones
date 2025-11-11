package com.app.meet.services;

import com.app.meet.data.ReunionRepository;
import com.app.meet.models.Reunion;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReunionService {
   private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }


    public List<Reunion> getAllReuniones(){
        return reunionRepository.findAll();
    }



}
