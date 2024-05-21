package set.ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> setAlunos;
	
	public GerenciadorAlunos() {
		setAlunos = new TreeSet<>();
	}

	public void adicionarAluno(String nome, long matricula, double nota) {
		setAlunos.add(new Aluno(nome, matricula, nota));
	}

	public void removerAluno(long matricula) {
		for (Aluno a : setAlunos) {
			if (a.getMatricula() == matricula) {
				setAlunos.remove(a);
			} else {
				System.out.println("Não há aluno com essa matrícula.");
			}
		}
	}

	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
		return alunosPorNome;
	}

	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(setAlunos);
		return alunosPorNota;
	}
	
	public void exibirAlunos() {
		for(Aluno a: setAlunos) {
			System.out.println(a);
		}
	}
}