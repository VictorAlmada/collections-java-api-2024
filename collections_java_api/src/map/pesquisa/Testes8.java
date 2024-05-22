package map.pesquisa;

public class Testes8 {

	public static void main(String[] args) {
		//instanciando
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		//adicionando
		estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
		estoque.adicionarProduto(2L, "Produto B", 10.0, 6);
		estoque.adicionarProduto(3L, "Produto C", 15.0, 2);
		estoque.adicionarProduto(4L, "Produto D", 20.0, 1);

		//exibindo
		estoque.exibirProdutos();
		
		//valor total do estoque
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", estoque.calcularValorTotalEstoque()));
		
		//produto mais caro
		System.out.println("Produto mais caro em estoque: " + estoque.obterProdutoMaisCaro());
		
		//produto mais barato
		System.out.println("Produto mais barato em estoque: " + estoque.obterProdutoMaisBarato());
		
		//produto com maior valor total em estoque
		System.out.println("Produto com maior valor total em estoque: " + estoque.obterProdutoComMaiorValorTotalDeEstoque());
	}

}
