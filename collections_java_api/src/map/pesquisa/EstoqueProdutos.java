package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	//atr
	private Map<Long, Produto> estoqueProdutosMap;
	//constr
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	//mét
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += (p.getPreco() * p.getQuantidade());
			}
		}
		return valorTotalEstoque;
	}
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
					maiorPreco = p.getPreco();
				}
			}
		}
		return produtoMaisCaro;
	}
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() < menorPreco) {
					produtoMaisBarato = p;
					menorPreco = p.getPreco();
				}
			}
		}
		return produtoMaisBarato;
	}
	public Produto obterProdutoComMaiorValorTotalDeEstoque() {
		Produto produtoMaiorValorTotalDeEstoque = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if ((p.getPreco() * p.getQuantidade()) > maiorPreco) {
					produtoMaiorValorTotalDeEstoque = p;
					maiorPreco = (p.getPreco() * p.getQuantidade());
				}
			}
		}
		return produtoMaiorValorTotalDeEstoque;

	}
}
