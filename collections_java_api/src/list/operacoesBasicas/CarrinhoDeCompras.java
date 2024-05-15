package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	//atr
	List<Item> listaDeItens;
	//constr
	public CarrinhoDeCompras() {
		this.listaDeItens = new ArrayList<>();
	}
	//mét
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaDeItens.add(new Item(nome, preco, quantidade));
	}
	public void removerItem(String nome) {
		List<Item> listaDeItensParaRemover = new ArrayList<>();
		for (Item i : listaDeItens) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				listaDeItensParaRemover.add(i);
			}
		}
		listaDeItens.removeAll(listaDeItensParaRemover);
	}
	public double calcularValorTotal() {
		double total = 0;
		for (Item i : listaDeItens) {
			total += i.getPreco() * i.getQuantidade();
		}
		return total;
	}
	public void exibirItens() {
		System.out.println(listaDeItens);
	}
	
}
