package set.ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
	//atr
	private String nome;
	private long codigo;
	private double preco;
	private int quantidade;
	
	//constr
	public Produto(String nome, long codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//comparable
	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	//get
	public String getNome() {
		return nome;
	}
	public long getCodigo() { 
		return codigo;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	//toString
	@Override
	public String toString() {
		return "{ " + codigo + ", " + nome + ", " + preco + ", " + quantidade + "}";
	}


	
}
