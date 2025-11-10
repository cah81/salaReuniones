package com.app.meet.data;

import com.app.meet.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository  extends JpaRepository<Persona,Long> {
}
