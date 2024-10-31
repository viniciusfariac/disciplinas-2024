package com.example.atividadeavaliativa;

public class User {
    private int id;
    private int telefone;
    private String name;
    private String email;
    private String sobrenome;

    public User() {
    }

    public User(int id, String name, String email, String sobrenome, int telefone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }


    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}
    public int getId() {
        return id;
    }

    public String getSobrenome() {return sobrenome;}

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {return telefone;}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
