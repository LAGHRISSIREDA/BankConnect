package com.codesigne.repositories;

import com.codesigne.entities.AgentEntity;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<AgentEntity, Long> {

    AgentEntity findByEmail(String email);
}

