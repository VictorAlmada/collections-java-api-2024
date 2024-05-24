package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Testes9 {

	public static void main(String[] args) {
		//inst
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
		agendaEventos.obterProximoEvento();
	}

}
