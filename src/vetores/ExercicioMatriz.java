package vetores;

import javax.swing.*;

public class ExercicioMatriz {

    public static void main(String[] args) {

        int qtsAlunos = 0, qtsNotas = 0;

        // quantidade de alunos
        String quantAlunosValor = JOptionPane.showInputDialog("Informe a quantidade de alunos: ");
        qtsAlunos = Integer.parseInt(quantAlunosValor);

        // quantidade de notas
        String quantNotasValor = JOptionPane.showInputDialog("Informe a quantidade de notas: ");
        qtsNotas = Integer.parseInt(quantNotasValor);

        // criando a matriz
        double[][] turma = new double[qtsAlunos][qtsNotas];

        // Loop para inserir valores na matriz
        for (int i = 0; i < qtsAlunos; i++) {
            for (int j = 0; j < qtsNotas; j++) {
                String notaValor = JOptionPane.showInputDialog("Informe a nota do aluno " + (i + 1) + " na disciplina " + (j + 1) + ": ");
                turma[i][j] = Double.parseDouble(notaValor);
            }
        }


        // Mostrar a matriz (apenas para verificar)
        StringBuilder matrizString = new StringBuilder();
        for (int i = 0; i < qtsAlunos; i++) {
            for (int j = 0; j < qtsNotas; j++) {
                matrizString.append(turma[i][j]);
                if (j < qtsNotas - 1) {
                    matrizString.append(", "); // Separar notas por vírgulas
                }
            }
            matrizString.append("\n"); // Nova linha para cada aluno
        }

        JOptionPane.showMessageDialog(null, "Matriz de Notas:\n" + matrizString.toString());
    }
}




