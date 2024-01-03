package lambda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Desafio {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Casa", 400000.00, 0.25);

        Produtos p2 = new Produtos("Lexus",300000.50,0.15);

        Double valor = p1.getPreco();

        Supplier<String> finalTotal = () -> "R$ " + formatarValor(valor);

        System.out.println("O valor final é " + finalTotal.get());  // Exibe R$ 400000,00

    }

    private static String formatarValor(double valor) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        return formato.format(valor);
    }
}
