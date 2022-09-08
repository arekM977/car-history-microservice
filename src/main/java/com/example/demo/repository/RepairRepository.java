package com.example.demo.repository;

import com.example.demo.model.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepairRepository extends JpaRepository<Repair, Long>
{

}