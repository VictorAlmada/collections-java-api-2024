package set.operacoesBasicas;

public class Testes4 {

	public static void main(String[] args) {
		
		//inst
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		// testes
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set.");
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set.");

		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set.");


	}

}
