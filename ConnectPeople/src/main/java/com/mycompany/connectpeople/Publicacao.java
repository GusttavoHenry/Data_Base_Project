/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connectpeople;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Publicacao {
    
    private Usuario dono;
    private String titulo;
    private String texto;
    private Date data_pub;

    public Publicacao(Usuario dono, String titulo, String texto, Date data_pub) {
        this.dono = dono;
        this.titulo = titulo;
        this.texto = texto;
        this.data_pub = data_pub;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getData_pub() {
        return data_pub;
    }

    public void setData_pub(Date data_pub) {
        this.data_pub = data_pub;
    }
    
    
    
}
