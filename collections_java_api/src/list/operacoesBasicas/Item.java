package list.operacoesBasicas;

public class Item {
	//atr
	private String nome;
	private double preco;
	private int quantidade;
	//constr
	public Item(String nome, double preco, int quantidade) {
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
	//mét
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	

	
	
}
