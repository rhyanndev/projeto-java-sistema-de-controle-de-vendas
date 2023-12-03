/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projeto.view;

import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.dao.VendasDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Produtos;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import br.com.projeto.model.Vendas;
import br.com.projeto.view.FrmVendas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Loja
 */
public class FrmListaProdutos extends javax.swing.JFrame {

    //Variável de instância para armazenar a referência ao "FrmVendas"
    private FrmVendas frmVendas;
    
    //Método lista tabela
    public void listar() {

        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutos();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();

        //limpar os dados das linhas
        dados.setNumRows(0);

        //para cada item da lista ele vai criar um objeto do tipo cliente chamado c
        for (Produtos c : lista) {

            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getQtd_estoque(),
                c.getFornecedor(),
                c.getPreco()});
        }

    }

    
    
    /**
     * Creates new form FrmListaClientes
     */
    public FrmListaProdutos(FrmVendas frmVendas) {
        this.frmVendas = frmVendas;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_fundo = new javax.swing.JPanel();
        painel_consultas = new javax.swing.JPanel();
        txtpesquisa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        painel_fundo.setBackground(new java.awt.Color(102, 0, 0));

        painel_consultas.setBackground(new java.awt.Color(255, 255, 255));

        txtpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisaActionPerformed(evt);
            }
        });
        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Nome:");

        btnPesquisar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar:");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Fornecedor", "Preço"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout painel_consultasLayout = new javax.swing.GroupLayout(painel_consultas);
        painel_consultas.setLayout(painel_consultasLayout);
        painel_consultasLayout.setHorizontalGroup(
            painel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        painel_consultasLayout.setVerticalGroup(
            painel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Produtos");

        javax.swing.GroupLayout painel_fundoLayout = new javax.swing.GroupLayout(painel_fundo);
        painel_fundo.setLayout(painel_fundoLayout);
        painel_fundoLayout.setHorizontalGroup(
            painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundoLayout.createSequentialGroup()
                .addGroup(painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_fundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painel_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_fundoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_fundoLayout.setVerticalGroup(
            painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Lista de Clientes");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaActionPerformed

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        String nome = "%" + txtpesquisa.getText() + "%";

        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosPorNome(nome);

        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        //limpar os dados das linhas
        dados.setNumRows(0);

        //para cada item da lista ele vai criar um objeto do tipo cliente chamado c
        for (Produtos c : lista) {

            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getQtd_estoque(),
                c.getFornecedor(),
                c.getPreco()});
        }
    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // botao pesquisar

        String nome = "%" + txtpesquisa.getText() + "%";

        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosPorNome(nome);

        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        //limpar os dados das linhas
        dados.setNumRows(0);

        //para cada item da lista ele vai criar um objeto do tipo cliente chamado c
        for (Produtos c : lista) {

            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getQtd_estoque(),
                c.getFornecedor(),
                c.getPreco()});
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        // TODO add your handling code here:
             
        tabelaProdutos.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int selectedRow = tabelaProdutos.getSelectedRow();
            if (selectedRow != -1) { 
                 // Verificar se alguma linha foi selecionada
                // Obtenha os valores da tabela
                
                /*String codigo = tabelaProdutos.getValueAt(selectedRow, 0).toString();
                String nome = tabelaProdutos.getValueAt(selectedRow, 1).toString();
                String qtdproduto = tabelaProdutos.getValueAt(selectedRow, 2).toString();
                String preco = tabelaProdutos.getValueAt(selectedRow, 4).toString();
                /*String fornecedor = tabelaProdutos.getValueAt(selectedRow, 4).toString();

                // Crie uma instância do FrmVendas e passe os valores
                FrmVendas tela = new FrmVendas();
                tela.setId(codigo);
                tela.setDescricao(nome);
                tela.setQtd_estoque(qtdproduto);
                tela.setPreco(preco);
                
                // Exiba o FrmVendas
                tela.setVisible(true);
                
                dispose();*/
                
                
        String codigo = tabelaProdutos.getValueAt(selectedRow, 0).toString();
        String nome = tabelaProdutos.getValueAt(selectedRow, 1).toString();
        String qtdproduto = tabelaProdutos.getValueAt(selectedRow, 2).toString();
        String preco = tabelaProdutos.getValueAt(selectedRow, 4).toString();

        // Atualize os campos do FrmVendas utilizando a referência passada
        frmVendas.setId(codigo);
        frmVendas.setDescricao(nome);
        frmVendas.setQtd_estoque(qtdproduto);
        frmVendas.setPreco(preco);
        
        //frmVendas.setVisible(true);
        dispose();
                
                
            }
        }
    });
        
     
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel_consultas;
    private javax.swing.JPanel painel_fundo;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtpesquisa;
    // End of variables declaration//GEN-END:variables

    /**private static class cadastro_de_clientes_consultajTabbedPane1 {

        private static void setSelectedIndex(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public cadastro_de_clientes_consultajTabbedPane1() {
        }
    }*/
}
