package lambda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BrunoTeste {

    public static void main(String[] args) {


        Produtos p1 = new Produtos("Lexus", 300000.50, 0.15);

        //preco - (preco * desconto)
        Function<Produtos, Double> precoFinal = x -> x.getPreco() - (x.getPreco() * x.getDesconto());

        // precoComDesconto * 0.085;  // 8,5% de imposto
        UnaryOperator<Double> impostoMunicipal = x -> x >= 2500 ? x * 0.085 : x;

        // frete >= 3000 se não frete /2
        UnaryOperator<Double> frete = x -> x >= 3000 ? x : x / 2;

        // arredondando o número
        UnaryOperator<Double> arredondar = x -> {
            BigDecimal valorDecimal = new BigDecimal(x);
            BigDecimal numeroArredondado = valorDecimal.setScale(2, RoundingMode.HALF_UP);
            return numeroArredondado.doubleValue();
        };
        // DecimalFormat formato = new DecimalFormat("#,##0.00");
        //        return formato.format(valor);
        Function<Double, String> formatar;

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p1);

        System.out.println("O preço final é " + preco);


    }
}
