package com.comarch.szkolenia.enkapsulacja;

public class Client {
    private String name;
    private String surname;
    private String age;

    public Client(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Client() {
    }

    //@Deprecated
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 3 &&
                name.charAt(0) == name.toUpperCase().charAt(0)) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

     private class X {

    }
}
