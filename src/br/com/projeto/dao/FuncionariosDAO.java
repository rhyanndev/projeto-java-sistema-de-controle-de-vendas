/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConexaoBanco;
import br.com.projeto.model.Funcionarios;
import br.com.projeto.view.FrmLogin;
import br.com.projeto.view.FrmMenu;
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

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            //executar comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

    //Método Alterar Funcionário
    public void alterarFuncionario(Funcionarios obj) {

        try {

            //Criar o comando SQL
            String sql = "update tb_funcionarios set nome=?,rg=?,cpf=?,email=?,senha=?,cargo=?,nivel_acesso=?, telefone=?,celular=?,cep=?,endereco=?,numero=?,"
                    + "complemento=?,bairro=?,cidade=?,estado=? where id=?";

            //Conectar o banco de dados e organizar o conteúdo sql
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            stmt.setInt(17, obj.getId());

            //executar comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

    //Método Excluir Funcionário
    public void excluirFuncionario(Funcionarios obj) {

        try {
            String sql = "delete from tb_funcionarios where id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }

    public List<Funcionarios> listarFuncionarios() {

        try {

            List<Funcionarios> lista = new ArrayList<>();

            String sql = "select * from tb_funcionarios";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionarios obj = new Funcionarios();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("Nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
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
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);

            return null;
        }

    }

    public Funcionarios consultaPorNome(String nome) {

        try {

            String sql = "select * from tb_funcionarios where nome = ?";

            //para executar o comando:
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, nome);

            //vai receber/armazenar a execução do SQL
            ResultSet rs = stmt.executeQuery();

            Funcionarios obj = new Funcionarios();

            if (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("Nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
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

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!" + "Erro:" + erro);

            return null;
        }

    }

    //Método lista funcionario por nome - retorna uma lista
    public List<Funcionarios> listaFuncionarioPorNome(String nome) {

        try {

            //1 passo - criar a lista
            List<Funcionarios> lista = new ArrayList<>();

            //2 passo - criar o comando SQL, organizar e executar 
            String sql = "select * from tb_funcionarios where nome like ?";

            //para executar o comando:
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, nome);

            //vai receber/armazenar a execução do SQL
            ResultSet rs = stmt.executeQuery();

            //rs - vai receber a execução
            //pegando todos os itens enquanto conseguir percorrer os registros no rs, 
            //ser adicionado a informações no objeto (obj)
            while (rs.next()) {

                Funcionarios obj = new Funcionarios();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("Nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
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

            JOptionPane.showMessageDialog(null, "Erro:" + erro);

            return null;
        }

    }

    //Método de login do funcionário
    public void efetuaLogin(String email, String senha) {

        try {

            // 1 - passo - SQL
            String sql = "select * from tb_funcionarios where email = ? and senha = ? ";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                //usuario logou

                //Caso o usuário seja do tipo admin
                if (rs.getString("nivel_acesso").equals("Administrador")) {

                    JOptionPane.showMessageDialog(null, "Seja bem vindo ao Sistema!");
                    FrmMenu tela = new FrmMenu();
                    tela.usuarioLogado = rs.getString("nome");
                    tela.setVisible(true);

                } // Caso o usuário seja do tipo limitado
                else if (rs.getString("nivel_acesso").equals("Usuário")) {
                    
                    JOptionPane.showMessageDialog(null, "Seja bem vindo ao Sistema!");
                    FrmMenu tela = new FrmMenu();
                    tela.usuarioLogado = rs.getString("nome");
                    
                    //Desabilitar os menus
                    
                    tela.menu_posicao.setEnabled(false);
                    tela.menu_controlevendas.setEnabled(false);
          
                    
                    tela.setVisible(true);

                }

            } else {
                //dados incorretos

                JOptionPane.showMessageDialog(null, "Dados incorretos!");
                new FrmLogin().setVisible(true);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);
        }

    }

}
