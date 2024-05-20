package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
	//atr
	private Set<Contato> contatoSet;
	//constr
	public AgendaContato() {
		this.contatoSet = new HashSet<>();
	}
	//mét
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> resultadoPesquisa = new HashSet<>();
		for (Contato c : contatoSet) {
			if (c.getNome().startsWith(nome)) {
				resultadoPesquisa.add(c);
			}
		}
		return resultadoPesquisa;
	}
	public void atualizarNumeroContato(String nome, int novoNumero) {
		for (Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				break;
			}
		}
		
	}
}
