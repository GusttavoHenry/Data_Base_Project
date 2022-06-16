/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connectpeople;

/**
 *
 * @author Guilherme
 */
public class Profissional extends Usuario{
    
    private String crp;

    public Profissional(String nome, String email, String senha, String cpf, String crp) {
        super(nome, email, senha, cpf);
        this.crp = crp;
    }
    
    public Profissional(String nome, String senha){
        super(nome, senha);
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }
    
}
