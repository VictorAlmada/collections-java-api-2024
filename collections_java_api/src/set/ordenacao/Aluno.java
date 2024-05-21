package set.ordenacao;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	//atr
	private String nome;
	private Long matricula;
	private double media;
	
	//constr
	public Aluno(String nome, Long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}
	
	//get
	public String getNome() {
		return nome;
	}
	public Long getMatricula() {
		return matricula;
	}
	public double getMedia() {
		return media;
	}
	
	//toString 
	@Override
	public String toString() {
		return "{ " + nome + ", " + matricula + ", " + media + "}";
	}
	
	
	//equals e hashcode
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}
}
