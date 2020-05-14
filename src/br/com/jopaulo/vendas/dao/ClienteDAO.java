/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jopaulo.vendas.dao;

import br.com.jopaulo.vendas.jdbc.ConnectionFactory;
import br.com.jopaulo.vendas.model.Clientes;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author joao
 */
public class ClienteDAO {
    
    private Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    
    
    public void cadastrarCliente(Clientes clientes){
        try {
            String sql = "insert into tb_clientes (nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)\n" +
"               values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
           
            java.sql.PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, clientes.getNome());
            statement.setString(2, clientes.getRg());
            statement.setString(3, clientes.getCpf());
            statement.setString(4, clientes.getEmail());
            statement.setString(5, clientes.getTelefone());
            statement.setString(6, clientes.getCelular());
            statement.setString(7, clientes.getCep());
            statement.setString(8, clientes.getEndereco());
            statement.setInt(9, clientes.getNumero());
            statement.setString(10, clientes.getComplemento());
            statement.setString(11, clientes.getBairro());
            statement.setString(12, clientes.getCidade());
            statement.setString(13, clientes.getUf());
            
            statement.execute();
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + e);
        }
    }
    
    public void editarCliente(){
        
    }
    
    public void excluirCliente(){
        
    }
    
}
