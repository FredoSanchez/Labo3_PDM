package com.example.form.utils;

public class JSON {
    private String name;
    private String gender;
    private String email;
    private String password;


    public JSON(String name, String gender, String email, String password) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getJSON (){
        return "{ Name: "       + getName()     + "\n" +
                "Gender: "      + getGender()   + "\n" +
                "Email: "       + getEmail()    + "\n" +
                "Password: "    + getPassword() +  " }";
    }
}
