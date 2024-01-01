package lambda;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOrImpar =
                n -> n % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOrImpar.apply(24));

        Function<String, String> oResultadoE =
                v -> "O resultado é: " + v;

        Function<String, String> empolgado =
                x -> x + "!!";

        Function<String, String> duvida =
                d -> d + "??";

        String resultadoFinal =
                parOrImpar.andThen(oResultadoE)
                        .andThen(empolgado)
                        .andThen(duvida)
                        .apply(24);

        System.out.println(resultadoFinal);


        Function<Integer, Integer> sum =
                x -> x + 10;

        System.out.println("Sum the x: " + sum.apply(27));

    }
}
