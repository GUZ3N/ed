package br.edu.saolucas.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class ClienteView extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private Long id;
	private JTextField txfNome, txfCpf, txfRg;
	private JRadioButton rbMasculino, rbFeminino;
	private JLabel lblDadosDigitados;
	private JButton btnSalvar, btnFechar;

	/**
	 * Create the frame.
	 */
	public ClienteView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 275);
		setLocationRelativeTo(null);
		setTitle("Novo Cadastro Cliente");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblNome = new JLabel("Cliente:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(15, 13, 70, 15);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(15, 40, 70, 15);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRg.setBounds(15, 67, 70, 15);
		contentPane.add(lblRg);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setBounds(15, 113, 70, 15);
		contentPane.add(lblSexo);

		txfNome = new JTextField();
		txfNome.setBounds(89, 9, 223, 21);
		contentPane.add(txfNome);
		txfNome.setColumns(10);
		
		txfCpf = new JTextField();
		txfCpf.setBounds(89, 36, 223, 21);
		contentPane.add(txfCpf);
		txfCpf.setColumns(10);
		
		txfRg = new JTextField();
		txfRg.setBounds(89, 63, 223, 21);
		contentPane.add(txfRg);
		txfRg.setColumns(10);
		
		rbMasculino = new JRadioButton("Masculino");
		rbMasculino.setSelected(true);
		rbMasculino.setBounds(96, 111, 110, 23);
		contentPane.add(rbMasculino);
		
		rbFeminino = new JRadioButton("Feminino");
		rbFeminino.setBounds(210, 111, 89, 23);
		contentPane.add(rbFeminino);		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rbMasculino);
		buttonGroup.add(rbFeminino);
		
		lblDadosDigitados = new JLabel("Dados Digitados");
		lblDadosDigitados.setBounds(96, 142, 216, 88);
		contentPane.add(lblDadosDigitados);

		btnSalvar = new JButton("Salvar");	
		btnSalvar.setBounds(336, 8, 117, 25);
		contentPane.add(btnSalvar);
		
		btnFechar = new JButton("Fechar");		
		btnFechar.setBounds(336, 57, 117, 25);
		contentPane.add(btnFechar);
		
		// Exemplos genéricos de manipulação de objetos na View
		// txfNome.setEnabled(false);
		// btnSalvar.setEnabled(false);
		// btnSalvar.setVisible(false);
		// btnFechar.setText("Vou sair");		
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public JTextField getTxfNome() {
		return txfNome;
	}

	public void setTxfNome(JTextField txfNome) {
		this.txfNome = txfNome;
	}

	public JTextField getTxfCpf() {
		return txfCpf;
	}

	public void setTxfCpf(JTextField txfCpf) {
		this.txfCpf = txfCpf;
	}

	public JTextField getTxfRg() {
		return txfRg;
	}

	public void setTxfRg(JTextField txfRg) {
		this.txfRg = txfRg;
	}
	
	public char getSexo() {
		if(rbFeminino.isSelected())
			return 'F';
		else
			return 'M';
	}

	public void setSexo(char sexo) {
		if(sexo == 'F')
			rbFeminino.setSelected(true);
		else
			rbMasculino.setSelected(true);				
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public JButton getBtnFechar() {
		return btnFechar;
	}

	public void setBtnFechar(JButton btnFechar) {
		this.btnFechar = btnFechar;
	}

	public JLabel getLblDadosDigitados() {
		return lblDadosDigitados;
	}

	public void setLblDadosDigitados(JLabel lblDadosDigitados) {
		this.lblDadosDigitados = lblDadosDigitados;
	}
}
