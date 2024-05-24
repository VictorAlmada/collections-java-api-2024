package map.ordenacao;

public class Livro {
	//atr
	private String titulo;
	private String autor;
	private Double preco;
	//constr
	public Livro(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	//get
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public Double getPreco() {
		return preco;
	}
	//toString
	@Override
	public String toString() {
		return "{" + titulo + ", " + autor + ", " + preco + "}";
	}
	
}
