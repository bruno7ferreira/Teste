package lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> sumTwo = x -> x + 2;
        UnaryOperator<Integer> multiplicationTwo = x -> x * 2;
        UnaryOperator<Integer> squared = x -> x * x;

        System.out.println(sumTwo.apply(10));
        System.out.println(multiplicationTwo.apply(10));
        System.out.println(squared.apply(10));

        System.out.println("-------------");
        System.out.println(sumTwo.andThen(multiplicationTwo).andThen(squared).apply(0));

        int result = sumTwo.andThen(multiplicationTwo)
                .andThen(squared)
                .apply(1);

        System.out.println("***********");

        System.out.println(
                sumTwo
                        .compose(multiplicationTwo)
                        .compose(squared)
                        .apply(1));

    }

}
