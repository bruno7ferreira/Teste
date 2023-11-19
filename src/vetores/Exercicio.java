package vetores;

import javax.swing.*;
import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

    double[] notasAlunoA = new double[3];
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8.9;

        
//        JOptionPane.showMessageDialog(null," o valor é: "+Arrays.toString(notasAlunoA));

        for (int i = 0; i< notasAlunoA.length;i++){
            System.out.println(notasAlunoA[i]);
        }

        for (double i: notasAlunoA) {
            System.out.println(i);
        }


    }

}
