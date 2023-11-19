package oo.classe;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public Aluno(String nome) {
        this.nome = nome;

    }


}
