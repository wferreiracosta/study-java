package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Javascript Completo");
		Curso curso3 = new Curso("Python Completo");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso1);
		aluno1.adicionarCurso(curso2);
		aluno2.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso3);
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
		
		System.out.println(aluno1.obterCursoPorNome("Java Completo"));
	}
}
