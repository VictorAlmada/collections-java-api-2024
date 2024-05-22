package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	//atr
	private Map<String, String> dicionarioMap;
	//constr
	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	//mét
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	public void removerPalavra(String palavra) {
		if (!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		} else {
			System.out.println("O dicionário está vazio.");
		}
	}
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	public String pesquisarPorPalavra(String palavra) {
		String pesquisaPalavra = null;
		if (!dicionarioMap.isEmpty()) {
			pesquisaPalavra = dicionarioMap.get(palavra);
		} else {
			System.out.println("O dicionário está vazio.");
		}
		return pesquisaPalavra;
	}
	
}
