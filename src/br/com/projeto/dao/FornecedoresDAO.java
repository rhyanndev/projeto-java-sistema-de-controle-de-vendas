/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConexaoBanco;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Loja
 */
public class FornecedoresDAO {
    
        private Connection con;
	
	
	//Fazendo conexao com o banco
	public FornecedoresDAO() {
		this.con = new ConexaoBanco().getConnection();
		
	}
        
        public void cadastrarFornecedores(Fornecedores obj) {

		try {

			//Criar o comando SQL
			String sql = "insert into tb_fornecedores(nome,cnpj,email,telefone,celular,cep,endereco,numero,"
					+ "complemento,bairro,cidade,estado) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			//Conectar o banco de dados e organizar o conteúdo sql
		
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,obj.getNome());
			stmt.setString(2,obj.getCnpj());
			stmt.setString(3,obj.getEmail());
			stmt.setString(4,obj.getTelefone());
			stmt.setString(5,obj.getCelular());
			stmt.setString(6,obj.getCep());
			stmt.setString(7,obj.getEndereco());
			stmt.setInt(8,obj.getNumero());
			stmt.setString(9,obj.getComplemento());
			stmt.setString(10,obj.getBairro());
			stmt.setString(11,obj.getCidade());
			stmt.setString(12,obj.getUf());
			
			
			//executar comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			

		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Erro: " + erro);
			
		}

	}
        
        
        public void alterarFornecedores(Fornecedores obj) {
		
		try {

			//Criar o comando SQL
			String sql = "update tb_fornecedores set nome=?,cnpj=?,email=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,"
					+ "complemento=?,bairro=?,cidade=?,estado=? where id=?";
			
			//Conectar o banco de dados e organizar o conteúdo sql
		
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,obj.getNome());
			stmt.setString(2,obj.getCnpj());
			stmt.setString(3,obj.getEmail());
			stmt.setString(4,obj.getTelefone());
			stmt.setString(5,obj.getCelular());
			stmt.setString(6,obj.getCep());
			stmt.setString(7,obj.getEndereco());
			stmt.setInt(8,obj.getNumero());
			stmt.setString(9,obj.getComplemento());
			stmt.setString(10,obj.getBairro());
			stmt.setString(11,obj.getCidade());
			stmt.setString(12,obj.getUf());
			
			stmt.setInt(13,obj.getId());
			
			
			//executar comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
			

		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Erro: " + erro);
			
		}
	}
        
        public void excluirFornecedores(Fornecedores obj) {
		
		try {

			//Criar o comando SQL
			String sql = "delete from tb_fornecedores where id = ?";
			
			//Conectar o banco de dados e organizar o conteúdo sql
		
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1,obj.getId());
			
			
			
			//executar comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
			

		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Erro: " + erro);
			
		}

	}
        
        
        public List<Fornecedores> listarFornecedores(){
		
		try {
			
			//1 passo - criar a lista
			List<Fornecedores> lista = new ArrayList<>();
			
			//2 passo - criar o comando SQL, organizar e executar 
			
			String sql = "select * from tb_fornecedores";
			
			//para executar o comando:
			PreparedStatement stmt = con.prepareStatement(sql);	
			
			//vai receber/armazenar a execução do SQL
			ResultSet rs = stmt.executeQuery();
			
			//rs - vai receber a execução
			
			
			//pegando todos os itens enquanto conseguir percorrer os registros no rs, 
			//será adicionado a informações no objeto (obj)
			while(rs.next()) {
				
				Fornecedores obj = new Fornecedores();
				
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setCnpj(rs.getString("cnpj"));
				obj.setEmail(rs.getString("email"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("cep"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getInt("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setBairro(rs.getString("bairro"));
				obj.setCidade(rs.getString("cidade"));
				obj.setUf(rs.getString("estado"));
				
				lista.add(obj);
			}
			
			return lista;
			
		} catch (SQLException erro) {
			
			JOptionPane.showMessageDialog(null, "Erro:"+erro);
			
			return null;
		}
	}
        
        
         //pesquisa através da igualdade "="
        public Fornecedores consultaPorNome(String nome){
            
            try {
                
                	String sql = "select * from tb_fornecedores where nome = ?";
			
			//para executar o comando:
			PreparedStatement stmt = con.prepareStatement(sql);	
			
                        stmt.setString(1, nome);
                        
			//vai receber/armazenar a execução do SQL
			ResultSet rs = stmt.executeQuery();
                        
                        Fornecedores obj = new Fornecedores();
                        
                        if(rs.next()) {				
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setCnpj(rs.getString("cnpj"));
				obj.setEmail(rs.getString("email"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("cep"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getInt("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setBairro(rs.getString("bairro"));
				obj.setCidade(rs.getString("cidade"));
				obj.setUf(rs.getString("estado"));
                        }
                        return obj;
                        
                        
            } 
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Fornecedor não encontrado!");
                
                return null;
            }
        
}
        
        //Método buscar cliente por nome - retorna uma lista
        public List<Fornecedores> listaFornecedoresPorNome(String nome){
		
		try {
			
			//1 passo - criar a lista
			List<Fornecedores> lista = new ArrayList<>();
			
			//2 passo - criar o comando SQL, organizar e executar 
			
			String sql = "select * from tb_fornecedores where nome like ?";
			
			//para executar o comando:
			PreparedStatement stmt = con.prepareStatement(sql);	
			
                        stmt.setString(1, nome);
                        
			//vai receber/armazenar a execução do SQL
			ResultSet rs = stmt.executeQuery();
			
			//rs - vai receber a execução
			
			
			//pegando todos os itens enquanto conseguir percorrer os registros no rs, 
			//ser� adicionado a informações no objeto (obj)
			while(rs.next()) {
				
				Fornecedores obj = new Fornecedores();
				
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setCnpj(rs.getString("cnpj"));
				obj.setEmail(rs.getString("email"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("cep"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getInt("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setBairro(rs.getString("bairro"));
				obj.setCidade(rs.getString("cidade"));
				obj.setUf(rs.getString("estado"));
				
				lista.add(obj);
			}
			
			return lista;
			
		} catch (SQLException erro) {
			
			JOptionPane.showMessageDialog(null, "Erro:"+erro);
			
			return null;
		}
                
                
	}
    
        
        
}
