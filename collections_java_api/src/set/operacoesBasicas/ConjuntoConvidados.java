package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	//atr
	private Set<Convidado> convidadoSet;
	//constr
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	//mét
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	public int contarConvidados() {
		return convidadoSet.size();
	}
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
}
