package set.pesquisa;

import java.util.Objects;

public class Tarefa {
	//atr
	private String descricao;
	private boolean concluida;
	
	//constr
	public Tarefa(String descricao, boolean concluida) {
		this.descricao = descricao;
		this.concluida = concluida;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}


	//get
	public String getDescricao() {
		return descricao;
	}
	public boolean getConcluida() {
		return concluida;
	}
	
	//set
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "{" + descricao + "," + concluida + "}";
	}
	
	
}
