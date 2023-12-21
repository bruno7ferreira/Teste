package lambda;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOrImpar =
                n -> n % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOrImpar.apply(24));

        Function<String, String> oResultadoE =
                v -> "O resultado é: " + v;


        String resultadoFinal =
                parOrImpar.andThen(oResultadoE).apply(24);

        System.out.println(resultadoFinal);

    }
}
