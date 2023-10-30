/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConexaoBanco;
import br.com.projeto.model.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Loja
 */
public class FuncionariosDAO {
    
    
    //Conexao
    
    private Connection con;
	
	
	//Fazendo conexao com o banco
	public FuncionariosDAO() {
		this.con = new ConexaoBanco().getConnection();
		
	}
    
    //Método cadastrar funcionário
        
        public void cadastrarFucionarios(Funcionarios obj) {

		try {

			//Criar o comando SQL
			String sql = "insert into tb_funcionarios(nome,rg,cpf,email, senha, cargo, nivel_acesso, telefone,celular,cep,endereco,numero,"
					+ "complemento,bairro,cidade,estado) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			//Conectar o banco de dados e organizar o conte�do sql
		
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,obj.getNome());
			stmt.setString(2,obj.getRg());
			stmt.setString(3,obj.getCpf());
			stmt.setString(4,obj.getEmail());
                        stmt.setString(5, obj.getSenha());
                        stmt.setString(6, obj.getCargo());
                        stmt.setString(7, obj.getNivel_acesso());                
			stmt.setString(8,obj.getTelefone());
			stmt.setString(9,obj.getCelular());
			stmt.setString(10,obj.getCep());
			stmt.setString(11,obj.getEndereco());
			stmt.setInt(12,obj.getNumero());
			stmt.setString(13,obj.getComplemento());
			stmt.setString(14,obj.getBairro());
			stmt.setString(15,obj.getCidade());
			stmt.setString(16,obj.getUf());
			
			
			//executar comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			

		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Erro: " + erro);
			
		}

	}
    
}
