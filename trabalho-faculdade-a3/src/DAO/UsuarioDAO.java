/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yasmi
 */
public class UsuarioDAO {
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDto){
        conn = (Connection) new ConexaoDAO().connectDB();
        
        try{
            String sql = "select * from usuarios where cpf = ? and senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDto.getCpf_usuario());
            pstm.setString(2, objUsuarioDto.getSenha_usuario());
            // pstm.setString(3, String.valueOf(objUsuarioDto.getPerfil_usuario()));

            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " +erro);
            return null;
        }
    }
}