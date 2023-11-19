import objetos.Produto;

import javax.swing.*;

public class Main {

    /**
     * @author Bruno Rogério
     * @since 1.0
     */
    public static void main(String[] args) {

        Produto p1 = new Produto();

        String valorNome = JOptionPane.showInputDialog("Informe o nome do Produto: ");
        p1.nome = valorNome;

        String valorPreco = JOptionPane.showInputDialog("Informe o preco do produto: ");
        p1.preco = Double.parseDouble(valorPreco);

        String valorDesconto = JOptionPane.showInputDialog("Informe o desconto do produto: ");
        p1.desconto = Double.parseDouble(valorDesconto);

        double precoFinal = p1.precoComDesconto();
        JOptionPane.showMessageDialog(null, "Preco do carro e r$" + p1.precoComDesconto());

    }
}
