package set.operacoesBasicas;

import java.util.Objects;

public class Convidado {
	//atr
	private String nome;
	private int codigoConvite;
	
	//constr
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	//get
	public String getNome() {
		return nome;
	}
	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

	//mét
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	
}
