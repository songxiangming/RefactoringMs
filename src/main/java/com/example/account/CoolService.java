package com.example.account;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CoolService {

    private String someString = "xx";

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public CoolService(String someString) {
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

    public  void fooB(){

    }

    public  void fooC(){

    }

    @Override
    public String toString() {
        return "CoolService{" +
                "someString='" + someString + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoolService that = (CoolService) o;
        return Objects.equals(someString, that.someString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someString);
    }
}
