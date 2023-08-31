package com.tmd.schoolPortal.repository;

import com.tmd.schoolPortal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository {
    List<Student> findAll();
}
