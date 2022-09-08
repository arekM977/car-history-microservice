package com.example.demo.repository;

import com.example.demo.model.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccidentRepository extends JpaRepository<Accident, Long>
{

}