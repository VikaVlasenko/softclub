package com.softclub.vvv.model;



public class User {

//    @Size(min = 1, max = 16, message = "Логин должен быть от 1 до 16 символов")
    private String username;

//    @Size(min = 1, max = 16, message = "Пароль должен быть от 1 до 16 символов")
    private String password;

    // Геттеры и сеттеры
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}