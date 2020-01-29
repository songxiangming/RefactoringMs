package com.example.account;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private String someString = "xx";

    public UserService(String someString) {
        this.someString = someString;
    }

    public String calledByMonoImpl(String param) {
        return someString + param;
    }
}
