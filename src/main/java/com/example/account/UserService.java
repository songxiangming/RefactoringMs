package com.example.account;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private String someString = "xx";

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public UserService(String someString) {
        this.someString = someString;
    }

    public String calledByMonoImpl(String param) {
        return someString + param;
    }

    public  void foo(){

    }

    public void bar (){

    }

    public  void fooA(){

    }


    public  void fooC(){

    }



}
