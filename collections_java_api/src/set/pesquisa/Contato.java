package set.pesquisa;

import java.util.Objects;

public class Contato {
	//atr
	private String nome;
	private int numero;
	
	//contr
	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	//get
	public String getNome() { 
		return nome;
	}
	public int getnumero() {
		return numero;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
	//toString
	@Override
	public String toString() {
		return "[Contato]Nome: " + nome + " - " + "Número: " + numero;
	}
	
}