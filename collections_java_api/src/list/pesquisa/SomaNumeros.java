package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	//atr
	private List<Integer> listaNumeros = new ArrayList<>();
	//get
	public List<Integer> getListaNumeros() {
		return listaNumeros;
	}
	//mét
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}

	public int calcularSoma() {
		int soma = 0;
		for (int x : listaNumeros) {
			soma += x;
		}
		return soma;
	}
	public int encontrarMaiorNumero() {
		int maiorValor = 0;
		for (int x : listaNumeros) {
			if (x > maiorValor) {
				maiorValor = x;
			}
		}
		return maiorValor;
	}
	public int encontrarMenorNumero() {
		int menorValor = listaNumeros.get(0);
		for (int x : listaNumeros) {
			if (x < menorValor) {
				menorValor = x;
			}
		}
		return menorValor;
	}
	public List<Integer> exibirNumeros() {
		return listaNumeros;
	}
}
