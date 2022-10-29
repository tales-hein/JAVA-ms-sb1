package com.exercice.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercice.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
