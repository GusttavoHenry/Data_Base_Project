/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connectpeople;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;

/**
 *
 * @author Guilherme
 */
public class ConexaoDB {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "ar_teste";
    private static String usuario = "root";
    private static String senha = "admin";
    
    public static Connection obterConexao() throws Exception{
        
        String url = String.format(
        "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                host,
                porta,
                db
        );
        return DriverManager.getConnection(url, usuario, senha);
    }
    
}
