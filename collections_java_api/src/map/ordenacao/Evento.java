package map.ordenacao;

public class Evento {
	//atr
	private String nome;
	private String atracao;
	//constr
	public Evento(String nome, String atracao) {
		this.nome = nome;
		this.atracao = atracao;
	}
	//get
	public String getNome() {
		return nome;
	}
	public String getAtracao() {
		return atracao;
	}
	//toString
	@Override
	public String toString() {
		return "{" + nome + ", " + atracao + "}";
	}
}
