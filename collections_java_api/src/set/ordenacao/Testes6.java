package set.ordenacao;

public class Testes6 {

	public static void main(String[] args) {
		/*
		//instanciando
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		//adicionar dados ao HashSet
		cadastroProdutos.adicionarProduto("Produto 5", 1L, 15d, 5);
		cadastroProdutos.adicionarProduto("Produto 0", 2L, 20d, 10);
		cadastroProdutos.adicionarProduto("Produto 3", 1L, 10d, 2);
		cadastroProdutos.adicionarProduto("Produto 9", 9L, 2d, 2);
		
		//exibir Hashset
		System.out.println(cadastroProdutos.getMeuHashSetImutavel());
		
		//ordenado por nome
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		//ordenado por preço
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		*/
		
		//instanciando
		GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();
		
		//adicionando
		gerenciadorAluno.adicionarAluno("Lucas", 123L, 6.9);
		gerenciadorAluno.adicionarAluno("Mateus", 456L, 5.8);
		gerenciadorAluno.adicionarAluno("Pedro", 789L, 9.1);
		gerenciadorAluno.adicionarAluno("João", 100L, 7.3);
		gerenciadorAluno.exibirAlunos();
		
		//removendo
		gerenciadorAluno.removerAluno(100L);
		gerenciadorAluno.exibirAlunos();
		
		//exibindo por nome
		System.out.println(gerenciadorAluno.exibirAlunosPorNome());
		
		//exibindo por nota
		System.out.println(gerenciadorAluno.exibirAlunosPorNota());
		
		//exibir alunos
		gerenciadorAluno.getAlunoSet();
		// ou gerenciadorAluno.exibirAlunos();

	}

}
