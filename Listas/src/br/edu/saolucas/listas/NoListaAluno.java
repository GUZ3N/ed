package br.edu.saolucas.listas;

// RESPOSTA DESAFIO
public class NoListaAluno {
	private Aluno aluno;
	private NoListaLigada proximoNo;	
	
	public NoListaAluno() {
		super();
	}
	
	public NoListaAluno(Aluno aluno) {
		super();
		this.aluno = aluno;
	}
	
	public NoListaAluno(Aluno aluno, NoListaLigada proximoNo) {
		super();
		this.aluno = aluno;
		this.proximoNo = proximoNo;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public NoListaLigada getProximoNo() {
		return proximoNo;
	}
	
	public void setProximoNo(NoListaLigada proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "NoListaAluno [aluno=" + aluno + ", proximoNo=" + proximoNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
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
		NoListaAluno other = (NoListaAluno) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (proximoNo == null) {
			if (other.proximoNo != null)
				return false;
		} else if (!proximoNo.equals(other.proximoNo))
			return false;
		return true;
	}
	
	
}
