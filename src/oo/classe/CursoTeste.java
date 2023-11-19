package oo.classe;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Bruno");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Luciclea");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Angula");
        Curso curso3 = new Curso("Banco de dados");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        aluno1.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos){
            System.out.println("estou matriculado no curso "+ curso1.nome);
            System.out.println("e meu nome e: "+aluno.nome);
        }


    }

}
