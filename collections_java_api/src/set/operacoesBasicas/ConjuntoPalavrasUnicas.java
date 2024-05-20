package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	//atr
	private Set<String> conjuntoPalavras;
	
	//constr
	public ConjuntoPalavrasUnicas() {
		this.conjuntoPalavras = new HashSet<>();
	}
	@Override
	public int hashCode() {
		return Objects.hash(conjuntoPalavras);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
		return Objects.equals(conjuntoPalavras, other.conjuntoPalavras);
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
		conjuntoPalavras.adicionarPalavra("Victor"); //não será adicionado no Set
		conjuntoPalavras.exibirPalavrasUnicas();

		
		}

}
