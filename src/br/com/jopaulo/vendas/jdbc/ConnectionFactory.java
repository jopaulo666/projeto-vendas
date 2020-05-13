/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jopaulo.vendas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author joao
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/BDVENDAS", "teste", "123");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
