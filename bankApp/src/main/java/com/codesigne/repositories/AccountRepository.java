package com.codesigne.repositories;

import com.codesigne.entities.AccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

    AccountEntity findByEmail(String email);
}
