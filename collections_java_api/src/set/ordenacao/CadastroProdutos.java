package set.ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	//atr
	public Set<Produto> produtoSet;
	
	//constr
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	//mét
	public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, codigo, preco, quantidade));
	}
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome; 
	}
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public Set<Produto> getMeuHashSetImutavel() {
        return Collections.unmodifiableSet(produtoSet);
    }
	
	
	
}
