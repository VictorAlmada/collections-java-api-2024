package list.pesquisa;

public class Testes2 {

	public static void main(String[] args) {
		SomaNumeros testes = new SomaNumeros();
		//adicionar
		testes.adicionarNumero(4);
		testes.adicionarNumero(22);
		testes.adicionarNumero(1);
		testes.adicionarNumero(51);
		testes.adicionarNumero(7);
		
		//encontrar maior
		System.out.println("Maior número: " + testes.encontrarMaiorNumero());
		
		//encontrar menor
		System.out.println("Menor número: " + testes.encontrarMenorNumero());
		
		//soma
		System.out.println("Soma: " + testes.calcularSoma());
		
		System.out.println("Lista de Números: " + testes.exibirNumeros());
	}

}
