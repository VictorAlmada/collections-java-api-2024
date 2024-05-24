package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Testes9 {

	public static void main(String[] args) {
		/*//inst
		AgendaEventos agendaEventos = new AgendaEventos();
		//adc
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
		//agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 24), "Evento 4", "Atração 4");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 27), "Evento 5", "Atração 5");
		//exibir
		agendaEventos.exibirAgenda();
		//obter próximo evento
		agendaEventos.obterProximoEvento();*/
		
		//livraria
		//inst
		LivrariaOnline livrariaOnline = new LivrariaOnline();
		//adic
		livrariaOnline.adicionarLivro("978-0-306-40615-7", "Titulo 1", "Autor 1", 3.99);
		livrariaOnline.adicionarLivro("978-1-307-40615-6", "Titulo 2", "Autor 2", 17.50);
		livrariaOnline.adicionarLivro("978-2-308-40615-5", "Titulo 3", "Autor 3", 5.55);
		livrariaOnline.adicionarLivro("978-3-309-40615-4", "Titulo 4", "Autor 4", 8.98);
		//exibir ordenado por preço
		livrariaOnline.exibirLivrosOrdenadosPorPreco();
		//pesquisar autor
		System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Autor 2"));
		//mais barato
		System.out.println("Mais Barato: " + livrariaOnline.exibirLivroMaisBarato());
		//mais caro
		System.out.println("Mais Caro: " + livrariaOnline.exibirLivroMaisCaro());
	}

}
