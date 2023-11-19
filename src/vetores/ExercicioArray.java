package vetores;

import javax.swing.*;
import java.util.Arrays;

public class ExercicioArray {

    public static void main(String[] args) {

        int totNotas = 0, mediaNotas = 0;

        // quantidade de notas
        String quantNotasValor = JOptionPane.showInputDialog("Informe a quantidade de notas: ");
        int quantNotas = Integer.parseInt(quantNotasValor);


        // criando o array
        double[] notas = new double[quantNotas];

        // armazenando notas no array
        for (int i = 0; i < quantNotas; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "* :"));
            totNotas += notas[i];
        }

        //exibindo valor do array
        JOptionPane.showMessageDialog(null, Arrays.toString(notas));
        mediaNotas = totNotas / notas.length;
        JOptionPane.showMessageDialog(null, " A soma das notas foi: " + totNotas);
        JOptionPane.showMessageDialog(null, " A media das foi: " + mediaNotas);

//        for (double cont : notas) {
//            System.out.println(cont);
//        }

    }
}
