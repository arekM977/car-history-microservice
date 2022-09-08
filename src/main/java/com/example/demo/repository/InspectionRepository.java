package com.example.demo.repository;

import com.example.demo.model.Inspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InspectionRepository extends JpaRepository<Inspection, Long>
{

}