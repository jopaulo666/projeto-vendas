/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jopaulo.vendas.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author joao
 */
public class TextConnection {
    
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso ao banco de dados!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar-se ao banco de dados: " + e);
        }
    }
}
