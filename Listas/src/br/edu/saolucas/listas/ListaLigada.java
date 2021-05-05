package br.edu.saolucas.listas;

public class ListaLigada {
	private NoListaAluno primeiroNo;
	private NoListaAluno ultimoNo;
	private int tamanhoLista;
	
	public ListaLigada() {
		super();
		tamanhoLista = 0;
		primeiroNo = null;
		ultimoNo = null;
	}
	
	/*
	public ListaLigada(NoListaAluno primeiroNo, NoListaAluno ultimoNo) {
		super();
		this.primeiroNo = primeiroNo;
		this.ultimoNo = ultimoNo;
	}
	*/
	
	public NoListaAluno getPrimeiroNo() {
		return primeiroNo;
	}

	public void setPrimeiroNo(NoListaAluno primeiroNo) {
		this.primeiroNo = primeiroNo;
	}

	public NoListaAluno getUltimoNo() {
		return ultimoNo;
	}

	public void setUltimoNo(NoListaAluno ultimoNo) {
		this.ultimoNo = ultimoNo;
	}

	@Override
	public String toString() {
		return "ListaLigada [primeiroNo=" + primeiroNo + ", ultimoNo=" + ultimoNo + "]";
	}
	
	public void adiciona(Aluno elemento) {
		
		// Verifica lista vazia
		// Se vazia, Setar elemento como primeiro e último nó
		
		// Se não vazia, 
		// obter último elemento, apontar o último elemento para este novo elemento
		// Ultimo nó passa a ser o novo elemento
		
		
		// incrementa tamanho da lista
		
	}
	
	
	
	public void adiciona(int posicao, Aluno elemento) {
		
	} 
	
	public Aluno pega(int posicao) {
		return null;
	} 
	
	public void remove(int posicao){
		
	} 	
	
	public boolean contem(Aluno elemento) {
		return false;
	}
	
	public int tamanho() {
		return tamanhoLista;
	} 
}
