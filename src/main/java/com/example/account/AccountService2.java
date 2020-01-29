package com.example.account;

import org.springframework.stereotype.Service;

@Service
public class AccountService2 {

    @Override
    public String toString() {
        return "AccountService{" +
                "someString='" + someString + '\'' +
                '}';
    }

    private String someString = "xx";

    public AccountService2(String someString) {
        this.someString = someString;
    }

    public String calledByMonoImpl(String param) {
        return someString + param;
    }
}
