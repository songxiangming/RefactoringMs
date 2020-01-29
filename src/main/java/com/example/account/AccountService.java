package com.example.account;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private String someString = "xx";


    public String calledByMonoImpl(String param) {
        return someString + param;
    }
}
