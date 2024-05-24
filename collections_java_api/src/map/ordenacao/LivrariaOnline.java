package map.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
	//atr
	private Map<String, Livro> livrariaMap;
	//constr
	public LivrariaOnline() {
		this.livrariaMap = new HashMap<>();
	}
	//mét
	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		livrariaMap.put(link, new Livro(titulo, autor, preco));
	}
	public void removerLivro(String titulo) {
		livrariaMap.remove(titulo);
	}
	public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> entryList = new ArrayList<>(livrariaMap.entrySet());
        entryList.sort(Comparator.comparingDouble(entry -> entry.getValue().getPreco()));
        Map<String, Livro> sortedBooks = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : entryList) {
            sortedBooks.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Livro> entry : sortedBooks.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getTitulo() + ": " + entry.getValue().getPreco());
        }

	}
	public Livro pesquisarLivrosPorAutor(String autor) {
		Livro listaLivrosPorAutor = null;
		for (Livro x : livrariaMap.values()) {
			if (x.getAutor().equalsIgnoreCase(autor)) {
				listaLivrosPorAutor = x;
			}
		}
		return listaLivrosPorAutor;
	}
	public Livro exibirLivroMaisBarato() {
		double valorMaisBarato = Double.MAX_VALUE;
		Livro livroMaisBarato = null;
		for (Livro x : livrariaMap.values()) {
			if (x.getPreco() < valorMaisBarato) {
				valorMaisBarato = x.getPreco();
				livroMaisBarato = x;
			}
		}
		return livroMaisBarato;
	}
	public Livro exibirLivroMaisCaro() {
		double valorMaisCaro = Double.MIN_VALUE;
		Livro livroMaisCaro = null;
		for (Livro x : livrariaMap.values()) {
			if (x.getPreco() > valorMaisCaro) {
				valorMaisCaro = x.getPreco();
				livroMaisCaro = x;
			}
		}
		return livroMaisCaro;
	}
}
