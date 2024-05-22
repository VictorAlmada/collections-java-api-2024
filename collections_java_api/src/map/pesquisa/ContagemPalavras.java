package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	//atr
	private Map<String, Integer> contagemPalavrasMap;
	//constr
	private ContagemPalavras() {
		this.contagemPalavrasMap = new HashMap<>();
	}
	//mét
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavrasMap.put(palavra, contagem);
	}
	public void removerPalavra(String palavra) {
		if (!contagemPalavrasMap.isEmpty()) {
			contagemPalavrasMap.remove(palavra);
		}
	}
	public void exibirContagemPalavras() {
		System.out.println(contagemPalavrasMap);
	}
	public String encontrarPalavraMaisFrequente() {
		int maiorContagem = Integer.MIN_VALUE;
		String maisFrequente = null;
		if (!contagemPalavrasMap.isEmpty()) {
			for (Map.Entry<String, Integer> x : contagemPalavrasMap.entrySet()) {
				if (x.getValue() > maiorContagem) {
					maiorContagem = x.getValue();
					maisFrequente = x.getKey();
				}
			}
		}
		return maisFrequente;
	}
	
	public static void main(String[] args) {
		//instanciando
		ContagemPalavras contagemPalavras = new ContagemPalavras();
		
		//adicionando
		contagemPalavras.adicionarPalavra("Palavra A", 5);
		contagemPalavras.adicionarPalavra("Palavra B", 2);
		contagemPalavras.adicionarPalavra("Palavra C", 33);
		contagemPalavras.adicionarPalavra("Palavra D", 7);
		contagemPalavras.adicionarPalavra("Palavra E", 1);
		
		//remover
		contagemPalavras.removerPalavra("Palavra E");
		
		//exibindo
		contagemPalavras.exibirContagemPalavras();
		
		System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());

	}
}
