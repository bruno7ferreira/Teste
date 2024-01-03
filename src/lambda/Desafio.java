package lambda;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.Supplier;

public class Desafio {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Casa", 400000.00, 0.25);
        Produtos p2 = new Produtos("Lexus", 300000.50, 0.15);

        Double valor = p1.getPreco();

        p2.calcularPrecoComDesconto();
        p2.calcularImpostoMunicipal();
        p2.calcularFrete(p2.getPreco());

        System.out.println(p2.getPreco());
        Double valor2 = p2.calcularPrecoComDesconto() + p2.calcularImpostoMunicipal() + p2.calcularFrete(p2.getPreco());
        System.out.println(valor2);

        Supplier<String> finalTotal = () -> "R$ " + formatarValor(valor);
        Supplier<String> finalTotal2 = () -> "R$ " + formatarValor(valor2);

        System.out.println("O valor final é " + finalTotal.get());  // Exibe R$ 400000,00
        System.out.println("O valor final é " + finalTotal2.get());

    }

    private static String formatarValor(double valor) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        return formato.format(valor);
    }
}
