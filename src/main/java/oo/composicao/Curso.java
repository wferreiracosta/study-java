package oo.composicao;

import java.util.ArrayList;

public class Curso {
	String nome;
	final ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public Curso() {
	}

	public Curso(String nome) {
		super();
		this.nome = nome;
	}

	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", alunos=" + alunos + "]";
	}

}
