package lambda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Desafio {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Casa", 400000.00, 0.25);

        Double valor = p1.getPreco();
        // Criar um objeto BigDecimal
        BigDecimal valorDecimal = new BigDecimal(valor);

        // Aplicar o arredondamento
//        BigDecimal numeroArredondado = valorDecimal.setScale(2, RoundingMode.HALF_UP);
//
//        System.out.println(numeroArredondado);

        Consumer<Produtos> produtoCustoTotal =
                x -> {
                    BigDecimal numeroArredondado2 = valorDecimal.setScale(2, RoundingMode.HALF_UP);
                    System.out.println(numeroArredondado2);
                };

        System.out.println("-----");
        produtoCustoTotal.accept(p1);

        Consumer<Produtos> valorFinal =
                x -> {
                    DecimalFormat formato = new DecimalFormat("#,##");
                    String numeroFormatado = formato.format(valor);
                };

        Supplier<String> finalTotal =
                () -> "R$ " + valorFinal;

        System.out.println("----");
        finalTotal.get();
//        Supplier<Produtos> valorFinal =
//                () -> "";
//

//        double numero = 123.456789;
//
//        // Criar um objeto DecimalFormat
//        DecimalFormat formato = new DecimalFormat("#.##");
//
//        // Aplicar o arredondamento
//        String numeroFormatado = formato.format(numero);


    }
}
