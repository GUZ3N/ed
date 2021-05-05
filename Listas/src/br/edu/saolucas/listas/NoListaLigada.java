package br.edu.saolucas.listas;

public class NoListaLigada {
	String nome;
	Integer idade;
	NoListaLigada proximoNo;
	 
	public NoListaLigada() {
		super();
	}
	
	public NoListaLigada(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public NoListaLigada(String nome, Integer idade, NoListaLigada proximoNo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.proximoNo = proximoNo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public NoListaLigada getProximoNo() {
		return proximoNo;
	}
	
	public void setProximoNo(NoListaLigada proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "NoListaLigada [nome=" + nome + ", idade=" + idade + ", proximoNo=" + proximoNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((proximoNo == null) ? 0 : proximoNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoListaLigada other = (NoListaLigada) obj;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (proximoNo == null) {
			if (other.proximoNo != null)
				return false;
		} else if (!proximoNo.equals(other.proximoNo))
			return false;
		return true;
	}

}
