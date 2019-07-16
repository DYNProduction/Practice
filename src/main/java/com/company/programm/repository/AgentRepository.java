package com.company.programm.repository;

import com.company.programm.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Integer> {
}
