package com.bruno.segundaapi.repository;


import com.bruno.segundaapi.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel,Long> {
}
