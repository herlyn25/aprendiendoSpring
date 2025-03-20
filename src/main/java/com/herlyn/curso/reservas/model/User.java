package com.herlyn.curso.reservas.model;

public class User {
    private String ine;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;

    public User(){

    }    
    public User(String ine, String nombres, String apellidos, String email, String password) {
        this.ine = ine;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
    }
    public String getIne() {
        return ine;
    }
    public void setIne(String ine) {
        this.ine = ine;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    
}
