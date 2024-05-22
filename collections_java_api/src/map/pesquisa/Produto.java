package map.pesquisa;

public class Produto {
	//atr
	private String nome;
	private double preco;
	private int quantidade;
	
	//constr
	public Produto (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//get
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	//toString 
	@Override
	public String toString() {
		return "{" + nome + ", " + preco + ", " + quantidade + "}";
 	}
}
