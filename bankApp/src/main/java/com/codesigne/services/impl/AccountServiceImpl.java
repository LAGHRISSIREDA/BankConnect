package com.codesigne.services.impl;

import com.codesigne.entities.AccountEntity;

import com.codesigne.repositories.AccountRepository;
import com.codesigne.services.AccountService;
import com.codesigne.shared.Utils;
import com.codesigne.shared.dto.AccountDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    Utils util;


    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        AccountEntity accountEntity = new AccountEntity();
        BeanUtils.copyProperties(accountDto, accountEntity);

        accountEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(accountDto.getPassword()));
        accountEntity.setAccountNumber(util.generateUserId(32));
        AccountEntity newAccount = accountRepository.save(accountEntity);

        AccountDto account = new AccountDto();
        BeanUtils.copyProperties(newAccount, account);
        return account;

    }

    @Override
    public AccountDto getAccount(String email) {
        AccountEntity accountEntity = accountRepository.findByEmail(email);
        if(accountEntity == null)throw new UsernameNotFoundException(email);
        AccountDto accountDto = new AccountDto();
        BeanUtils.copyProperties(accountEntity, accountDto);
        return accountDto;
    }

}
