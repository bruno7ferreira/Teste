package oo.temp.calculadora;

import oo.temp.calculadora.Operadores;

import javax.swing.*;

import static oo.temp.calculadora.Operadores.values;

public class SistemaMain {

    public static void main(String[] args) {


        String valor1 = JOptionPane.showInputDialog("Informe um número:");
        String valor2 = JOptionPane.showInputDialog("Informe um número:");

        Double num1 = Double.parseDouble(valor1);
        Double num2 = Double.parseDouble(valor2);

        // Mostra as opções disponíveis
        Operadores[] operacoes = values();
        JOptionPane.showMessageDialog(null, "Escolha a operação:");

        Operadores escolha = (Operadores) JOptionPane.showInputDialog(null,
                "Escolha a operação:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                operacoes,
                operacoes[0]);

        double resultado = calcular(num1, num2, escolha);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);


        // Método para calcular a operação escolhida
        
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
                    JOptionPane.showMessageDialog(null, "Erro! Divisão por zero não é permitida.");
                    System.exit(0);
                }
                break;
        }
        return resultado;
    }
}
