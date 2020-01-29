package com.example.account;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private String someString = "xx";

    public AccountService(String someString) {
        this.someString = someString;
    }

    public String calledByMonoImpl(String param) {
        return someString + param;
    }
}
