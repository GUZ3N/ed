package br.edu.saolucas.listas;

public class ListaAluno {
	private String nome;
	private int idade;
	private ListaAluno proximo;
	
	public ListaAluno() {
		
	}
	
	public ListaAluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public ListaAluno(String nome, int idade, ListaAluno proximo) {
		this.nome = nome;
		this.idade = idade;
		this.proximo = proximo;		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public ListaAluno getProximo() {
		return proximo;
	}
	public void setProximo(ListaAluno proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		return "ListaAluno [nome=" + nome + ", idade=" + idade + ", proximo=" + proximo + "]";
	}

}


