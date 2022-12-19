package com.rapidtech.springdasar.singleton;

public class Person {
    private static Person persons;

    public static Person getInstance(){
        if (persons == null){
            persons = new Person();
        }
        return persons;
    }

    private Person(){

    }
}
