package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	//atr
	List<Pessoa> listaPessoas;
	
	//constr
	public OrdenacaoPessoa() {
		this.listaPessoas = new ArrayList<>();
	}
	
	//mét
	//adicionar
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	//ordenar por idade
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	//ordenar por altura
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
}
