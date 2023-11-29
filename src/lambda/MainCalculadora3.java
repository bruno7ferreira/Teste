package lambda;

import java.util.function.BinaryOperator;

public class MainCalculadora3 {

    public static void main(String[] args) {

        BinaryOperator<Double> Subtracao = (x, y) -> {
            return x - y;
        };
        System.out.println(Subtracao.apply(10.0, 2.0));

        BinaryOperator<Double> multiplicacao = (x, y) -> x * y;


    }
}
