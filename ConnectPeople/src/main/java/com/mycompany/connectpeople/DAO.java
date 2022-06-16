/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connectpeople;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Guilherme
 */
import java.sql.ResultSet;
public class DAO{
        public boolean cadastroExistente(Usuario usuario) throws Exception{
            String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ? AND email = ? AND cpf = ?";
            try(Connection conn = ConexaoDB.obterConexao()){
                    PreparedStatement ps = conn.prepareStatement(sql);{
                        ps.setString(1, usuario.getNome());
                        ps.setString(2, usuario.getSenha());
                        ps.setString(3, usuario.getEmail());
                        ps.setString(4, usuario.getCpf());
                        try(ResultSet rs = ps.executeQuery()){
                            return rs.next();
                        }
                }
        }
    }        
        public boolean cadastroExistenteProfissional(Profissional profissional) throws Exception{
            String sql = "SELECT * FROM profissional WHERE nome = ? AND senha = ? AND email = ? AND cpf = ? AND crp = ?";
            try(Connection conn = ConexaoDB.obterConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql); {
                ps.setString(1, profissional.getNome());
                ps.setString(2, profissional.getSenha());
                ps.setString(3, profissional.getEmail());
                ps.setString(4, profissional.getCpf());
                ps.setString(5, profissional.getCrp());
                try(ResultSet rs = ps.executeQuery()){
                    return rs.next();
                }               
            }
        }
    }
        public boolean loginExistente(Usuario usuario) throws Exception {
            String sql = "SELECT  * FROM usuario WHERE nome = ? AND senha = ?";
            try(Connection conn = ConexaoDB.obterConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql);{
                ps.setString(1, usuario.getNome());
                ps.setString(2, usuario.getSenha());
                try(ResultSet rs = ps.executeQuery()){
                    return rs.next();
                }
            }
        }
    }
        public boolean loginExistente(Profissional profissional) throws Exception {
            String sql = "SELECT  * FROM profissional WHERE nome = ? AND senha = ?";
            try(Connection conn = ConexaoDB.obterConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql);{
                ps.setString(1, profissional.getNome());
                ps.setString(2, profissional.getSenha());
                try(ResultSet rs = ps.executeQuery()){
                    return rs.next();
                }
            }
        }
    }
}