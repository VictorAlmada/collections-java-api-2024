package set.pesquisa;

public class Testes5 {
	public static void main(String[] args) {
		//AgendaContato agendaContatos = new AgendaContato();
		/*
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("Camila", 0);
		agendaContatos.adicionarContato("Camila Cavalcante", 111111);
		agendaContatos.adicionarContato("Camila DIO", 654987);
		agendaContatos.adicionarContato("Maria Silva", 111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Camila"));
		
		agendaContatos.atualizarNumeroContato("Maria Silva", 555555);
		
		agendaContatos.exibirContatos(); // após atualização
		*/
		
		ListaTarefas listaTarefas = new ListaTarefas();
		
		//listaTarefas.exibirTarefas();
		
		//adicionando
		listaTarefas.adicionarTarefa("Lavar a louça");
		listaTarefas.adicionarTarefa("Limpar a casa");
		listaTarefas.adicionarTarefa("Varrer o chão");
		listaTarefas.adicionarTarefa("Alimentar cachorro");
		listaTarefas.exibirTarefas();
		
		//removendo
		listaTarefas.removerTarefa("Alimentar cachorro");
		listaTarefas.exibirTarefas();
		
		//contando
		listaTarefas.contarTarefas();
		
		//marcar como concluida
		listaTarefas.marcarTarefaConcluida("Varrer o chão");
		listaTarefas.marcarTarefaConcluida("Lavar a louça");
		listaTarefas.exibirTarefas();
		
		//marcar como pendente
		listaTarefas.marcarTarefaPendente("Varrer o chão");
		listaTarefas.exibirTarefas();
		
		//limpar a lista de tarefas
		listaTarefas.limparListaTarefas();
		listaTarefas.exibirTarefas();
	}
}
