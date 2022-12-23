package com.codesigne.services;

import com.codesigne.shared.dto.AccountDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccount(String email);
}
