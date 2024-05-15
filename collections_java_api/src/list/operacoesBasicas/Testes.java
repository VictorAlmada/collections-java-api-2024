package list.operacoesBasicas;

public class Testes {

	public static void main(String[] args) {
		CarrinhoDeCompras listaDeItens = new CarrinhoDeCompras();
		
		listaDeItens.adicionarItem("açucar", 5.15, 4);
		listaDeItens.adicionarItem("leite", 3.50, 2);
		listaDeItens.adicionarItem("arroz", 4.10, 3);
		
		
		listaDeItens.exibirItens();
		
		System.out.println("Valor total: R$ " + String.format("%.2f", listaDeItens.calcularValorTotal()));
		
	}

}
