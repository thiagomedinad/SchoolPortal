package com.tmd.schoolPortal.repository;


import com.tmd.schoolPortal.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findByNome(String nome);

    List<Professor> findAll();


}