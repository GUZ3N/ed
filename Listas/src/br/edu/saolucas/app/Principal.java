package br.edu.saolucas.app;

import br.edu.saolucas.listas.Aluno;
import br.edu.saolucas.listas.ListaAluno;
import br.edu.saolucas.listas.ListaLigada;

public class Principal {

	public static void main(String[] args) {
		
		// Declarar objeto e inicializá-lo
		ListaAluno alunoA = new ListaAluno();
		alunoA.setNome("Aluno A");
		alunoA.setIdade(18);
		
		System.out.println(alunoA);
		
		// Sobre construtores de classes
		ListaAluno alunoB = new ListaAluno("João", 25);
		System.out.println(alunoB);
		
		alunoA.setProximo(alunoB);
				
		ListaAluno alunoD= new ListaAluno("Maria", 19);
		
		ListaAluno alunoC = new ListaAluno("Beatriz", 17, alunoD);
		
		
		
		
		ListaLigada listaLigada = new ListaLigada();
		
		Aluno aluno = new Aluno("Alberto", 17);
		
		listaLigada.adiciona(aluno);
		
		System.out.println(listaLigada.toString());
		
	}

}
