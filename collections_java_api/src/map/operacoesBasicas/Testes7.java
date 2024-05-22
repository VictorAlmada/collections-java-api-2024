package map.operacoesBasicas;

public class Testes7 {
	public static void main(String[] args) {
		//instanciando
		//AgendaContatos agendaContatos = new AgendaContatos();
		Dicionario dicionario = new Dicionario();
		
		/*
		//adicionando
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("Camila", 566556);
		agendaContatos.adicionarContato("Camila Cavalcante", 111111);
		agendaContatos.adicionarContato("Camila DIO", 654987);
		agendaContatos.adicionarContato("Maria Silva", 111111);
		agendaContatos.adicionarContato("Camila", 444444);
		
		//exibindo
		agendaContatos.exibirContatos();
		
		//removendo
		agendaContatos.removerContato("Maria Silva");
		agendaContatos.exibirContatos();
		
		//pesquisando por nome
		System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
		*/
		
		
		
		dicionario.adicionarPalavra("Crisálida", "Estágio de desenvolvimento de certos insetos, especialmente borboletas e mariposas, no qual o inseto está em um casulo ou pupa.");
		dicionario.adicionarPalavra("Epifania", "Manifestação súbita e reveladora de algo, especialmente uma ideia ou verdade importante.");
		dicionario.adicionarPalavra("Filantropia", " Ação ou esforço de ajudar os outros por meio de doações de dinheiro, trabalho ou recursos.");
		dicionario.adicionarPalavra("Resiliência", "Capacidade de se recuperar ou se adaptar rapidamente diante de dificuldades ou mudanças.");
		dicionario.adicionarPalavra("Quimera", "Ilusão ou fantasia; algo que é desejado, mas impossível de alcançar.");
		
		dicionario.exibirPalavras();
		System.out.println("Descrição: " + dicionario.pesquisarPorPalavra("Crisálida"));
	}
	
}
