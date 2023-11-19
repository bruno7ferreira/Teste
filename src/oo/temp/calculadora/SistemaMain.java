package oo.temp.calculadora;

import oo.temp.calculadora.Operadores;

import javax.swing.*;

import static oo.temp.calculadora.Operadores.values;

public class SistemaMain {

    public static void main(String[] args) {


        String valor1 = JOptionPane.showInputDialog("Informe um n�mero:");
        String valor2 = JOptionPane.showInputDialog("Informe um n�mero:");

        Double num1 = Double.parseDouble(valor1);
        Double num2 = Double.parseDouble(valor2);

        // Mostra as op��es dispon�veis
        Operadores[] operacoes = values();
        JOptionPane.showMessageDialog(null, "Escolha a opera��o:");

        Operadores escolha = (Operadores) JOptionPane.showInputDialog(null,
                "Escolha a opera��o:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                operacoes,
                operacoes[0]);

        double resultado = calcular(num1, num2, escolha);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);


        // M�todo para calcular a opera��o escolhida
        
    }

    private static double calcular(Double num1, Double num2, Operadores escolha) {
        double resultado = 0;
        switch (escolha) {
            case SOMA:
                resultado = num1 + num2;
                break;
            case SUBTRACAO:
                resultado = num1 - num2;
                break;
            case MULTIPLICACAO:
                resultado = num1 * num2;
                break;
            case DIVISAO:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro! Divis�o por zero n�o � permitida.");
                    System.exit(0);
                }
                break;
        }
        return resultado;
    }
}
