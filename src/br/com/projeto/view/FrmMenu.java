/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projeto.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Loja
 */
public class FrmMenu extends javax.swing.JFrame {
    
    public String usuarioLogado;
    

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_controle_de_clientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_controlefuncionarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_controlefornecedores = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menu_controle_estoque = new javax.swing.JMenuItem();
        menu_consultaprodutos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_abrir_pdv = new javax.swing.JMenuItem();
        menu_posicao = new javax.swing.JMenuItem();
        menu_controlevendas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menu_trocadeusuario = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário logado:");

        lblusuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setText("Marcelo Nunes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusuario)
                .addContainerGap(995, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblusuario))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jMenu1.setInheritsPopupMenu(true);
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 70));

        menu_controle_de_clientes.setText("Controle de Clientes");
        menu_controle_de_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_controle_de_clientesActionPerformed(evt);
            }
        });
        jMenu1.add(menu_controle_de_clientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionarios.png"))); // NOI18N
        jMenu2.setText("Funcionários");
        jMenu2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 70));

        menu_controlefuncionarios.setText("Controle de Funcionários");
        menu_controlefuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_controlefuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(menu_controlefuncionarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fornecedores.png"))); // NOI18N
        jMenu3.setText("Fornecedores");
        jMenu3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 70));

        menu_controlefornecedores.setText("Controle de Fornecedores");
        menu_controlefornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_controlefornecedoresActionPerformed(evt);
            }
        });
        jMenu3.add(menu_controlefornecedores);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produtos.png"))); // NOI18N
        jMenu6.setText("Produtos");
        jMenu6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 70));

        menu_controle_estoque.setText("Controle de Estoque");
        menu_controle_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_controle_estoqueActionPerformed(evt);
            }
        });
        jMenu6.add(menu_controle_estoque);

        menu_consultaprodutos.setText("Consulta de Produtos");
        menu_consultaprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_consultaprodutosActionPerformed(evt);
            }
        });
        jMenu6.add(menu_consultaprodutos);

        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendas.png"))); // NOI18N
        jMenu4.setText("Vendas");
        jMenu4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 70));

        menu_abrir_pdv.setText("Abrir PDV");
        menu_abrir_pdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_abrir_pdvActionPerformed(evt);
            }
        });
        jMenu4.add(menu_abrir_pdv);

        menu_posicao.setText("Posição do dia");
        menu_posicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_posicaoActionPerformed(evt);
            }
        });
        jMenu4.add(menu_posicao);

        menu_controlevendas.setText("Histórico de Vendas");
        menu_controlevendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_controlevendasActionPerformed(evt);
            }
        });
        jMenu4.add(menu_controlevendas);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuracoes.png"))); // NOI18N
        jMenu5.setText("Configurações");
        jMenu5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 70));

        menu_trocadeusuario.setText("Trocar de usuário");
        menu_trocadeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_trocadeusuarioActionPerformed(evt);
            }
        });
        jMenu5.add(menu_trocadeusuario);

        jMenuBar1.add(jMenu5);

        menu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        menu_sair.setText("Sair");
        menu_sair.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        menu_sair.setPreferredSize(new java.awt.Dimension(150, 70));
        menu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 387, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Tela cheia
        
        this.setExtendedState(this.MAXIMIZED_BOTH);
        lblusuario.setText(usuarioLogado);
        this.setVisible(true);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void menu_trocadeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_trocadeusuarioActionPerformed
        // TODO add your handling code here:
        
        FrmLogin telalogin = new FrmLogin();
        this.dispose();
        telalogin.setVisible(true);
    }//GEN-LAST:event_menu_trocadeusuarioActionPerformed

    private void menu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sairMouseClicked
        // TODO add your handling code here:
        
        int op;
        
        op = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?");
        
        if(op == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_menu_sairMouseClicked

    private void menu_consultaprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_consultaprodutosActionPerformed
        // TODO add your handling code here:
        
        FrmProdutos telaprodutos = new FrmProdutos();
        telaprodutos.consulta_produtosjTabbedPane1.setSelectedIndex(1);
        telaprodutos.setVisible(true);
        
    }//GEN-LAST:event_menu_consultaprodutosActionPerformed

    private void menu_controle_de_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_controle_de_clientesActionPerformed
        // TODO add your handling code here:
        Frmcliente tela = new Frmcliente();
        tela.cadastro_de_clientes_consultajTabbedPane1.setSelectedIndex(1);
        tela.setVisible(true);
    }//GEN-LAST:event_menu_controle_de_clientesActionPerformed

    private void menu_controlefuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_controlefuncionariosActionPerformed
        // TODO add your handling code here:
        
        FrmFuncionarios tela = new FrmFuncionarios();
        tela.cadastro_funcionarios_consultajTabbedPane1.setSelectedIndex(1);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menu_controlefuncionariosActionPerformed

    private void menu_controlefornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_controlefornecedoresActionPerformed
        // TODO add your handling code here:
        
        FrmFornecedores tela = new FrmFornecedores();
        tela.cadastro_de_fornecedores_consulta.setSelectedIndex(1);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menu_controlefornecedoresActionPerformed

    private void menu_controle_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_controle_estoqueActionPerformed
        // TODO add your handling code here:
        
        FrmEstoque tela = new FrmEstoque();
        tela.setVisible(true);

    }//GEN-LAST:event_menu_controle_estoqueActionPerformed

    private void menu_abrir_pdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_abrir_pdvActionPerformed
        // TODO add your handling code here:
        
        FrmVendas tela = new FrmVendas();
        tela.setVisible(true);
    }//GEN-LAST:event_menu_abrir_pdvActionPerformed

    private void menu_controlevendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_controlevendasActionPerformed
        // TODO add your handling code here:
        
        FrmHistorico tela = new FrmHistorico();
        tela.setVisible(true);
    }//GEN-LAST:event_menu_controlevendasActionPerformed

    private void menu_posicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_posicaoActionPerformed
        // TODO add your handling code here:
        
        FrmTotalVenda tela = new FrmTotalVenda();
        tela.setVisible(true);
    }//GEN-LAST:event_menu_posicaoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JMenuItem menu_abrir_pdv;
    private javax.swing.JMenuItem menu_consultaprodutos;
    private javax.swing.JMenuItem menu_controle_de_clientes;
    private javax.swing.JMenuItem menu_controle_estoque;
    private javax.swing.JMenuItem menu_controlefornecedores;
    private javax.swing.JMenuItem menu_controlefuncionarios;
    public javax.swing.JMenuItem menu_controlevendas;
    public javax.swing.JMenuItem menu_posicao;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenuItem menu_trocadeusuario;
    // End of variables declaration//GEN-END:variables
}
