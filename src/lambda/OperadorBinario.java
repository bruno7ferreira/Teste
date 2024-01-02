package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) / 2;


        System.out.println("Média é " + media.apply(5.0, 15.0));

        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> media.apply(n1, n2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(5.0, 15.0));

        Function<Double, String> conceito =
                (x) -> x >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(5.0, 15.0));

        System.out.println(media.apply(7.0,9.0).intValue());
    }
}
