package br.edu.saolucas.app;

import java.awt.EventQueue;

import br.edu.saolucas.controller.ClienteController;
import br.edu.saolucas.model.ClienteModel;
import br.edu.saolucas.view.ClienteView;

public class Principal {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ClienteView clienteView = new ClienteView();
					ClienteModel clienteModel = new ClienteModel();
					
					// Simulando a edição de um cadastro existente no BD:
					// descomente o bloco de código para verificar o funcionamento
					
					/*
					clienteModel.setId(15l);
					clienteModel.setNome("Adalberto Roberto");
					clienteModel.setCpf("111.111.111-11");
					clienteModel.setRg("111.111");
					clienteModel.setSexo('F');
					*/
					
					ClienteController clienteController = new ClienteController(clienteView, clienteModel);
					clienteController.iniciaController();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
}
