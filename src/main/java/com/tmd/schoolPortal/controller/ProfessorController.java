package com.tmd.schoolPortal.controller;

import com.tmd.schoolPortal.model.Professor;
import com.tmd.schoolPortal.repository.ProfessorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school-portal")
public class ProfessorController {

    private final ProfessorRepository professorRepository;

    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @GetMapping("/professor/name")
    public List<Professor> getProfessorName(){
        return professorRepository.findByNome("Thiago");
    }

    @GetMapping("/professor/names")
    public List<Professor> getProfessorsNames() {
        return professorRepository.findAll();
    }
}
