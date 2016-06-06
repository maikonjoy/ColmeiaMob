package com.example.encontroibrs.colmeia;

import java.io.Serializable;

/**
 * Created by Encontro IBRS on 06/06/2016.
 */
public class Usuario implements Serializable {
    private static final long serialVersionID = 1L;
    private String email;
    private String senha;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }


}
