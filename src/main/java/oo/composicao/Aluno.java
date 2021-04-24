package oo.composicao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aluno {
	String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();

	public Aluno() {
	}

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
	}

	public List<Curso> obterCursoPorNome(String nome) {
		return this.cursos
				.stream()
				.filter(c -> c.nome.equalsIgnoreCase(nome))
				.collect(Collectors.toList());
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}

}
