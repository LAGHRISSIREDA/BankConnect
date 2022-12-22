package com.codesigne.repositories;

import com.codesigne.entities.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<TransactionEntity, Long> {


}

