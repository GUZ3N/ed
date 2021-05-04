package br.edu.saolucas.controller;

import javax.swing.JOptionPane;

import br.edu.saolucas.model.ClienteModel;
import br.edu.saolucas.view.ClienteView;

public class ClienteController {
	
	private ClienteView clienteView;
	private ClienteModel clienteModel;
	
	public ClienteController(ClienteView clienteView, ClienteModel clienteModel) {		
		this.clienteView = clienteView;
		this.clienteModel = clienteModel;		
		
		clienteView.getBtnSalvar().addActionListener(e -> cliqueBtnSalvar());
		clienteView.getBtnFechar().addActionListener(e -> cliqueBtnFechar());
		
		verificaEdicao();
	}
	
	public void iniciaController() {		
		clienteView.setVisible(true);
	}
	
	private void verificaEdicao() {
		if(!(clienteModel.isNull())) 
			setDadosView();
	}
	
	private void setDadosView() {
		clienteView.setTitle("Editar Cliente");
		
		clienteView.setId(clienteModel.getId());
		clienteView.getTxfNome().setText(clienteModel.getNome());
		clienteView.getTxfCpf().setText(clienteModel.getCpf());
		clienteView.getTxfRg().setText(clienteModel.getRg());
		clienteView.setSexo(clienteModel.getSexo());
	}
	
	public void setDadosModel() {
		clienteModel.setId(clienteView.getId());
		clienteModel.setNome(clienteView.getTxfNome().getText());
		clienteModel.setCpf(clienteView.getTxfCpf().getText());
		clienteModel.setRg(clienteView.getTxfRg().getText());
		clienteModel.setSexo(clienteView.getSexo());
	}
	
	// Caso houvesse a implementação de "gravar" no banco de dados no ClienteModel
	// poderiamos solicitar o registro dos dados do cliente no BD
	// ou a atualização do registro do cliente no caso de edição
	public void gravar(ClienteModel clienteModel) {
		//clienteModel.gravar();
	}
	
	public void cliqueBtnSalvar() {		
		setDadosModel();
		gravar(clienteModel);		
		
		
		// Testes genéricos de manipulação de objetos da Interface Gráfica
		
		JOptionPane.showMessageDialog(null, "Você clicou no botão SALVAR.");
		
		Long id = null;
		String nome, cpf, rg;
		char sexo;
		
		id = clienteView.getId();
		nome = clienteView.getTxfNome().getText();
		cpf = clienteView.getTxfCpf().getText();
		rg = clienteView.getTxfRg().getText();
		sexo = clienteView.getSexo();
		
		JOptionPane.showMessageDialog(null, nome);
		
		clienteView.getLblDadosDigitados().setText("<html> ID: "+ id + "<br> Nome: "+ nome + "<br> CPF: " + cpf +  "<br> RG: " + rg + "<br> Sexo: " + sexo + "</html>");
	
		JOptionPane.showMessageDialog(null, clienteModel.toString());
	}	
	
	void cliqueBtnFechar() {
		clienteView.dispose();
	}

 }
