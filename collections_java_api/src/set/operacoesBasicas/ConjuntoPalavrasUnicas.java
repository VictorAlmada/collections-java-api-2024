package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	//atr
	private Set<String> conjuntoPalavras;
	
	//constr
	public ConjuntoPalavrasUnicas() {
		this.conjuntoPalavras = new HashSet<>();
	}
	
	//mét
	public void adicionarPalavra(String palavra) {
		conjuntoPalavras.add(palavra);
	}
	public void removerpalavra(String palavra) {
		conjuntoPalavras.remove(palavra);
	}
	public void verificarPalavra(String palavra) {
		boolean check1 = false;
		for (String p : conjuntoPalavras) {
			if (p.contains(palavra)) {
				System.out.println("Palavra está presente no conjunto.");
				check1 = true;
				break;
			}	
		}
		if (check1 == false) {
			System.out.println("Palavra não está presente no conjunto.");
		}
	}
	public void exibirPalavrasUnicas() {
		for (String p : conjuntoPalavras) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
		
		conjuntoPalavras.adicionarPalavra("Victor");
		conjuntoPalavras.adicionarPalavra("Stardew");
		conjuntoPalavras.adicionarPalavra("Mario");
		conjuntoPalavras.exibirPalavrasUnicas();
		System.out.println("Após remover: ");
		conjuntoPalavras.removerpalavra("Mario");
		conjuntoPalavras.exibirPalavrasUnicas();
		conjuntoPalavras.verificarPalavra("Victor");
		
		}

}
