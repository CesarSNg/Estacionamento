/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefinal;

import java.sql.*;
import java.util.*;

public class ClienteDAO {

   private Connection con;
   
   public ClienteDAO(Connection con) {
       this.con = con;
   }
   
   public Connection getCon() {
       return con;
   }

   public void setCon(Connection con) {
       this.con = con;
   }
    
   // Criar o metodo insert
   public String inserirCliente(ClienteBean cliente) {
       
       String sql = "insert into tbcliente(nomeCli, emailCli, telCelCli, telComCli, telResCli) values(?,?,?,?,?)";
       
       try {
          PreparedStatement ps = getCon().prepareStatement(sql);
          
          ps.setString(1, cliente.getNomeCli());
          ps.setString(2, cliente.getEmailCli());
          ps.setString(3, cliente.getTelCelCli());
          ps.setString(4, cliente.getTelComCli());
          ps.setString(5, cliente.getTelResCli());
    

          if (ps.executeUpdate() >0) {
             return "inserido com sucesso !";
          } else {
             return "erro ao inserir !";
          }
       } catch (SQLException ex) {
          return ex.getMessage();
       }    
   }
   
   public List<ClienteBean> listarTodos() {
       String sql = "select * from tbcliente";
       
       List<ClienteBean> listaClientes = new ArrayList<>();
       
       try {
           PreparedStatement ps = getCon().prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           
           if (rs != null) {
               
               while (rs.next()) {
                   ClienteBean cb = new ClienteBean();
                   cb.setCodCli(rs.getInt(1));
                   cb.setNomeCli(rs.getString(2));
                   cb.setEmailCli(rs.getString(3));

                   listaClientes.add(cb);
               }
               return listaClientes;
           } else {
               return null;
           }
       } catch (SQLException ex) {
           return null;
       }
       
   }
  } 

