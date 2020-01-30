package com.example.account;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MasterServiceRename {

    private String someString = "xx";

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public MasterServiceRename(String someString) {
        this.someString = someString;
    }

    public String calledByMonoImpl(String param) {
        return someString + param;
    }

    public  void foo(){

    }

    public void bar (){

    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MasterServiceRename that = (MasterServiceRename) o;
        return Objects.equals(someString, that.someString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someString);
    }

}
