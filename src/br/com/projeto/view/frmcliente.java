package br.com.projeto.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.model.Clientes;

import javax.swing.JScrollPane;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class frmcliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtcodigo;
	private JTextField txtnome;
	private JTextField txtemail;
	private JTextField txtendereco;
	private JTextField txtnumero;
	private JTextField txtcidade;
	private JTextField txtbairro;
	private JTextField txtcomplemento;
	private JTextField txtnomeconsulta;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmcliente frame = new frmcliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *
	 */
	public frmcliente() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 128));
		panel.setBounds(0, 0, 763, 84);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(263).addComponent(lblNewLabel).addContainerGap(282, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(26).addComponent(lblNewLabel).addContainerGap(29, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 106, 763, 308);
		contentPane.add(tabbedPane);

		JPanel panel_dados_pessoais = new JPanel();
		panel_dados_pessoais.setBackground(Color.WHITE);
		tabbedPane.addTab("Dados Pessoais", null, panel_dados_pessoais, null);

		JLabel jLabel1 = new JLabel("C\u00F3digo:");
		jLabel1.setBounds(10, 13, 41, 15);
		jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jLabel1.setHorizontalAlignment(SwingConstants.LEFT);

		txtcodigo = new JTextField();
		txtcodigo.setBounds(61, 11, 86, 20);
		txtcodigo.setColumns(10);

		JLabel jLabel6 = new JLabel("Nome:");
		jLabel6.setBounds(10, 44, 41, 15);
		jLabel6.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtnome = new JTextField();
		txtnome.setBounds(61, 42, 190, 20);
		txtnome.setColumns(10);

		txtemail = new JTextField();
		txtemail.setBounds(61, 80, 190, 20);
		txtemail.setColumns(10);

		JLabel jLabel2 = new JLabel("Email:");
		jLabel2.setBounds(10, 82, 41, 15);
		jLabel2.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel jLabel7 = new JLabel("Celular:");
		jLabel7.setBounds(313, 84, 41, 15);
		jLabel7.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 12));

		MaskFormatter celularFormatter = new MaskFormatter("(##) # ####-####");
		JFormattedTextField txtcelularformattedTextField = new JFormattedTextField(celularFormatter);
		txtcelularformattedTextField.setBounds(358, 82, 124, 20);

		JLabel jLabel8 = new JLabel("Telefone:");
		jLabel8.setBounds(509, 84, 53, 15);
		jLabel8.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel8.setFont(new Font("Tahoma", Font.PLAIN, 12));

		MaskFormatter telefoneFormatter = new MaskFormatter("##-#########");
		JFormattedTextField txttelefoneformattedTextField = new JFormattedTextField(telefoneFormatter);
		txttelefoneformattedTextField.setBounds(566, 82, 102, 20);

		MaskFormatter cepFormatter = new MaskFormatter("#####-###");
		JFormattedTextField txtcepformattedTextField = new JFormattedTextField(cepFormatter);
		txtcepformattedTextField.setBounds(61, 110, 124, 20);

		JLabel jLabel3 = new JLabel("CEP:");
		jLabel3.setBounds(10, 112, 41, 15);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtendereco = new JTextField();
		txtendereco.setBounds(265, 112, 229, 20);
		txtendereco.setColumns(10);

		JLabel jLabel10 = new JLabel("Endere\u00E7o:");
		jLabel10.setBounds(203, 117, 56, 15);
		jLabel10.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel10.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtnumero = new JTextField();
		txtnumero.setBounds(545, 114, 86, 20);
		txtnumero.setColumns(10);

		JLabel jLabel9 = new JLabel("N\u00BA:");
		jLabel9.setBounds(512, 116, 23, 15);
		jLabel9.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel9.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtcidade = new JTextField();
		txtcidade.setBounds(60, 147, 86, 20);
		txtcidade.setColumns(10);

		JLabel jLabel4 = new JLabel("Cidade:");
		jLabel4.setBounds(10, 149, 40, 15);
		jLabel4.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtbairro = new JTextField();
		txtbairro.setBounds(204, 149, 86, 20);
		txtbairro.setColumns(10);

		JLabel jLabel11 = new JLabel("Bairro:");
		jLabel11.setBounds(164, 151, 34, 15);
		jLabel11.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel11.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel jLabel12 = new JLabel("Complemento:");
		jLabel12.setBounds(308, 151, 80, 15);
		jLabel12.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel12.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtcomplemento = new JTextField();
		txtcomplemento.setBounds(392, 149, 243, 20);
		txtcomplemento.setColumns(10);

		JLabel jLabel13 = new JLabel("UF:");
		jLabel13.setBounds(645, 151, 18, 15);
		jLabel13.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		MaskFormatter rgFormatter = new MaskFormatter("##.###.###-#");
		JFormattedTextField txtrgformattedTextField = new JFormattedTextField(rgFormatter);
		txtrgformattedTextField.setBounds(61, 187, 124, 20);

		JLabel jLabel5 = new JLabel("RG:");
		jLabel5.setBounds(10, 189, 41, 15);
		jLabel5.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 12));

		//JFormattedTextField txtcpfformattedTextField = new JFormattedTextField();
		//txtcpfformattedTextField.setBounds(255, 187, 124, 20);
		
         MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
         JFormattedTextField txtcpfformattedTextField = new JFormattedTextField(cpfFormatter);
         txtcpfformattedTextField.setBounds(255, 187, 124, 20);


		JLabel jLabel14 = new JLabel("CPF:");
		jLabel14.setBounds(204, 188, 24, 15);
		jLabel14.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel14.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JComboBox cbuf = new JComboBox();
		cbuf.setBounds(673, 149, 53, 20);
		cbuf.setModel(new DefaultComboBoxModel(
				new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB",
						"PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
		panel_dados_pessoais.setLayout(null);
		panel_dados_pessoais.add(jLabel2);
		panel_dados_pessoais.add(txtemail);
		panel_dados_pessoais.add(jLabel3);
		panel_dados_pessoais.add(txtcepformattedTextField);
		panel_dados_pessoais.add(jLabel10);
		panel_dados_pessoais.add(jLabel7);
		panel_dados_pessoais.add(txtcelularformattedTextField);
		panel_dados_pessoais.add(txtendereco);
		panel_dados_pessoais.add(jLabel9);
		panel_dados_pessoais.add(txtnumero);
		panel_dados_pessoais.add(jLabel8);
		panel_dados_pessoais.add(txttelefoneformattedTextField);
		panel_dados_pessoais.add(jLabel4);
		panel_dados_pessoais.add(txtcidade);
		panel_dados_pessoais.add(jLabel11);
		panel_dados_pessoais.add(jLabel5);
		panel_dados_pessoais.add(txtrgformattedTextField);
		panel_dados_pessoais.add(txtbairro);
		panel_dados_pessoais.add(jLabel12);
		panel_dados_pessoais.add(txtcomplemento);
		panel_dados_pessoais.add(jLabel14);
		panel_dados_pessoais.add(txtcpfformattedTextField);
		panel_dados_pessoais.add(jLabel13);
		panel_dados_pessoais.add(cbuf);
		panel_dados_pessoais.add(jLabel1);
		panel_dados_pessoais.add(txtcodigo);
		panel_dados_pessoais.add(jLabel6);
		panel_dados_pessoais.add(txtnome);

		JPanel panel_consulta_de_clientes = new JPanel();
		panel_consulta_de_clientes.setBackground(Color.WHITE);
		tabbedPane.addTab("Consulta de Clientes", null, panel_consulta_de_clientes, null);

		txtnomeconsulta = new JTextField();
		txtnomeconsulta.setBounds(62, 9, 315, 20);
		txtnomeconsulta.setColumns(10);

		JLabel jLabelNomeConsulta = new JLabel("Nome:");
		jLabelNomeConsulta.setBounds(16, 11, 36, 15);
		jLabelNomeConsulta.setHorizontalAlignment(SwingConstants.LEFT);
		jLabelNomeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(422, 7, 99, 23);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_consulta_de_clientes.setLayout(null);
		panel_consulta_de_clientes.add(jLabelNomeConsulta);
		panel_consulta_de_clientes.add(txtnomeconsulta);
		panel_consulta_de_clientes.add(btnPesquisar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(7, 34, 744, 204);
		panel_consulta_de_clientes.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "C\u00F3digo", "Nome", "RG", "E-mail",
				"Telefone", "Celular", "Cep", "Endere\u00E7o", "N\u00BA", "Comp", "Bairro", "Cidade", "UF" }));

		JButton btnNovo = new JButton("NOVO");
		btnNovo.setBounds(149, 428, 89, 23);
		contentPane.add(btnNovo);

		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// botao salvar


					Clientes obj = new Clientes();
					obj.setNome(txtnome.getText());
					obj.setRg(txtrgformattedTextField.getText());
					obj.setEmail(txtemail.getText());
					obj.setTelefone(txttelefoneformattedTextField.getText());
					obj.setCelular(txtcelularformattedTextField.getText());
					obj.setCep(txtcepformattedTextField.getText());
					obj.setEndereco(txtendereco.getText());
					obj.setNumero(Integer.parseInt(txtnumero.getText()));
					obj.setComplemento(txtcomplemento.getText());
					obj.setBairro(txtbairro.getText());
					obj.setCidade(txtcidade.getText());
					obj.setUf(cbuf.getSelectedItem().toString());
					
					ClientesDAO dao = new ClientesDAO();
					dao.cadastrarCliente(obj);
						
			}
		});
		btnSalvar.setBounds(255, 428, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(362, 428, 89, 23);
		contentPane.add(btnEditar);

		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(474, 428, 89, 23);
		contentPane.add(btnExcluir);
	}
}
