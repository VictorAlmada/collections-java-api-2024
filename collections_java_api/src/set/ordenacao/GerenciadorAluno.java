package set.ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
	//atr
	private Set<Aluno> alunoSet;
	//constr
	public GerenciadorAluno() {
		this.alunoSet = new HashSet<>();
	}
	//get
	public Set<Aluno> getAlunoSet() {
        return Collections.unmodifiableSet(alunoSet);
    }
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}
	public void removerAluno(Long matricula) {
		Iterator<Aluno> iterator = alunoSet.iterator();
        while (iterator.hasNext()) {
            Aluno a = iterator.next();
            if (a.getMatricula().equals(matricula)) {
                iterator.remove(); // Removendo elemento usando o método remove do Iterator
            }
        }
	}
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		return alunosPorNome; 
	}
	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(alunoSet);
		return alunosPorNota;
	}
	public void exibirAlunos() {
		System.out.println(alunoSet);
	}
	
	
	
}
