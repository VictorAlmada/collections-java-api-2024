package list.operacoesBasicas;

public class Tarefa {
	//atr
	private String descricao;
	
	//constr
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	//get
	public String getDescricao() {
		return descricao;
	}
	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + "]";
	}
	
	
}
