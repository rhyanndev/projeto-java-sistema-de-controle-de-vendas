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
			
			
			//executar comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			

		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Erro: " + erro);
			
		}

	}

	public void alterarCliente() {

	}

	public void excluirCliente() {

	}
	
	public List<Clientes> listarClientes(){
		
		try {
			
			//1º passo - criar a lista
			List<Clientes> lista = new ArrayList<>();
			
			//2º passo - criar o comando SQL, organizar e executar 
			
			String sql = "select * from tb_clientes";
			
			//para executar o comando:
			PreparedStatement stmt = con.prepareStatement(sql);	
			
			//vai receber/armazenar a execução do SQL
			ResultSet rs = stmt.executeQuery();
			
			//rs - vai receber a execução
			
			
			//pegando todos os itens enquanto conseguir percorrer os registros no rs, 
			//será adicionado a informações no objeto (obj)
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
				obj.setUf(rs.getString("uf"));
				
				lista.add(obj);
			}
			
			return lista;
			
		} catch (SQLException erro) {
			
			JOptionPane.showMessageDialog(null, "Erro:"+erro);
			
			return null;
		}
	}

}





















