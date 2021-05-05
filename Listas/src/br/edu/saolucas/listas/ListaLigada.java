package br.edu.saolucas.listas;

public class ListaLigada {
	NoListaLigada primeiroNo;
	NoListaLigada ultimoNo;
	
	public ListaLigada() {
		super();
	}
	
	public ListaLigada(NoListaLigada primeiroNo, NoListaLigada ultimoNo) {
		super();
		this.primeiroNo = primeiroNo;
		this.ultimoNo = ultimoNo;
	}

	public NoListaLigada getPrimeiroNo() {
		return primeiroNo;
	}

	public void setPrimeiroNo(NoListaLigada primeiroNo) {
		this.primeiroNo = primeiroNo;
	}

	public NoListaLigada getUltimoNo() {
		return ultimoNo;
	}

	public void setUltimoNo(NoListaLigada ultimoNo) {
		this.ultimoNo = ultimoNo;
	}

	@Override
	public String toString() {
		return "ListaLigada [primeiroNo=" + primeiroNo + ", ultimoNo=" + ultimoNo + "]";
	}
	
	
	
}
