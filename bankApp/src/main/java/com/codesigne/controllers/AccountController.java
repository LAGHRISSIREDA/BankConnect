package com.codesigne.controllers;


import com.codesigne.requests.AccountRequest;
import com.codesigne.responses.AccountResponse;
import com.codesigne.services.AccountService;
import com.codesigne.shared.dto.AccountDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public ResponseEntity<String> getAccount() {
        System.out.println("inside get accounts");
        return ResponseEntity.ok("hello from get");
    }


    @PostMapping
    public AccountResponse createAccount(@RequestBody AccountRequest accountRequest) {
        AccountDto accountDto = new AccountDto();
        BeanUtils.copyProperties(accountRequest, accountDto);

        AccountDto createAccount = accountService.createAccount(accountDto);

        AccountResponse accountResponse = new AccountResponse();

        BeanUtils.copyProperties(createAccount, accountResponse);
        return accountResponse;
    }
}
