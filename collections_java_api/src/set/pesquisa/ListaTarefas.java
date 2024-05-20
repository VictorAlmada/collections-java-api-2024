package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	//atr
	private Set<Tarefa> tarefasSet;
	
	//constr
	public ListaTarefas() {
		tarefasSet = new HashSet<>();
	}
	
	//mét
	public void adicionarTarefa(String descricao) {
		tarefasSet.add(new Tarefa(descricao, false));
	}
	public void removerTarefa(String descricao) {
		for (Tarefa t : tarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasSet.remove(t);
				break;
			}
		}
	}
	public void exibirTarefas() {
		System.out.println(tarefasSet);
	}
	public void contarTarefas() {
		int countTarefas = tarefasSet.size();
		System.out.println("Número total de tarefas: " + countTarefas);
	}
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : tarefasSet) {
			if (t.getConcluida() == true) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa t : tarefasSet) {
			if (t.getConcluida() == false) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : tarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
				break;
			}
		}
	}
	public void marcarTarefaPendente(String descricao) {
		for (Tarefa t : tarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(false);
				break;
			}
		}
	}
	public void limparListaTarefas() {
		tarefasSet.clear();
	}
}
