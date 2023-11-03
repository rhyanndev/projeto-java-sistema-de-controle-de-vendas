/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.projeto.jdbc.ConexaoBanco;
import br.com.projeto.model.Clientes;
/**
 *
 * @author Loja
 */
public class ClientesDAO {
    
    private Connection con;
	
	
	//Fazendo conexao com o banco
	public ClientesDAO() {
		this.con = new ConexaoBanco().getConnection();
		
	}
	
	public void cadastrarCliente(Clientes obj) {

		try {

			//Criar o comando SQL
			String sql = "insert into tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,"
					+ "complemento,bairro,cidade,estado) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			//Conectar o banco de dados e organizar o conte�do sql
		
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,obj.getNome());
			stmt.setString(2,obj.getRg());
			stmt.setString(3,obj.getCpf());
			stmt.setString(4,obj.getEmail());
			stmt.setString(5,obj.getTelefone());
			stmt.setString(6,obj.getCelular());
			stmt.setString(7,obj.getCep());
			stmt.setString(8,obj.getEndereco());
			stmt.setInt(9,obj.getNumero());
			stmt.setString(10,obj.getComplemento());
			stmt.setString(11,obj.getBairro());
			stmt.setString(12,obj.getCidade());
			stmt.setString(13,obj.getUf());
			
			
			//executar comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			

		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Erro: " + erro);
			
		}

	}

	public void alterarCliente(Clientes obj) {
		
		try {

			//Criar o comando SQL
			String sql = "update tb_clientes set nome=?,rg=?,cpf=?,email=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,"
					+ "complemento=?,bairro=?,cidade=?,estado=? where id=?";
			
			//Conectar o banco de dados e organizar o conteúdo sql
		
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,obj.getNome());
			stmt.setString(2,obj.getRg());
			stmt.setString(3,obj.getCpf());
			stmt.setString(4,obj.getEmail());
			stmt.setString(5,obj.getTelefone());
			stmt.setString(6,obj.getCelular());
			stmt.setString(7,obj.getCep());
			stmt.setString(8,obj.getEndereco());
			stmt.setInt(9,obj.getNumero());
			stmt.setString(10,obj.getComplemento());
			stmt.setString(11,obj.getBairro());
			stmt.setString(12,obj.getCidade());
			stmt.setString(13,obj.getUf());
			
			stmt.setInt(14,obj.getId());
			
			
			//executar comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
			

		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Erro: " + erro);
			
		}


	}

	public void excluirCliente(Clientes obj) {
		
		try {

			//Criar o comando SQL
			String sql = "delete from tb_clientes where id = ?";
			
			//Conectar o banco de dados e organizar o conte�do sql
		
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
	
	public List<Clientes> listarClientes(){
		
		try {
			
			//1 passo - criar a lista
			List<Clientes> lista = new ArrayList<>();
			
			//2 passo - criar o comando SQL, organizar e executar 
			
			String sql = "select * from tb_clientes";
			
			//para executar o comando:
			PreparedStatement stmt = con.prepareStatement(sql);	
			
			//vai receber/armazenar a execução do SQL
			ResultSet rs = stmt.executeQuery();
			
			//rs - vai receber a execução
			
			
			//pegando todos os itens enquanto conseguir percorrer os registros no rs, 
			//ser� adicionado a informações no objeto (obj)
			while(rs.next()) {
				
				Clientes obj = new Clientes();
				
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("Nome"));
				obj.setRg(rs.getString("rg"));
				obj.setCpf(rs.getString("cpf"));
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
        public Clientes consultaPorNome(String nome){
            
            try {
                
                	String sql = "select * from tb_clientes where nome = ?";
			
			//para executar o comando:
			PreparedStatement stmt = con.prepareStatement(sql);	
			
                        stmt.setString(1, nome);
                        
			//vai receber/armazenar a execução do SQL
			ResultSet rs = stmt.executeQuery();
                        
                        Clientes obj = new Clientes();
                        
                        if(rs.next()) {				
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("Nome"));
				obj.setRg(rs.getString("rg"));
				obj.setCpf(rs.getString("cpf"));
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
                JOptionPane.showMessageDialog(null,"Cliente não encontrado!");
                
                return null;
            }
        
}
        
        
        //Método buscar cliente por nome - retorna uma lista
        public List<Clientes> listaClientePorNome(String nome){
		
		try {
			
			//1 passo - criar a lista
			List<Clientes> lista = new ArrayList<>();
			
			//2 passo - criar o comando SQL, organizar e executar 
			
			String sql = "select * from tb_clientes where nome like ?";
			
			//para executar o comando:
			PreparedStatement stmt = con.prepareStatement(sql);	
			
                        stmt.setString(1, nome);
                        
			//vai receber/armazenar a execução do SQL
			ResultSet rs = stmt.executeQuery();
			
			//rs - vai receber a execução
			
			
			//pegando todos os itens enquanto conseguir percorrer os registros no rs, 
			//ser� adicionado a informações no objeto (obj)
			while(rs.next()) {
				
				Clientes obj = new Clientes();
				
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("Nome"));
				obj.setRg(rs.getString("rg"));
				obj.setCpf(rs.getString("cpf"));
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
