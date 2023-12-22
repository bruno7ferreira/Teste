package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num
                -> num % 2 == 0;

        Predicate<Integer> isTresDigitos =
                num -> num >= 100 && num < 1000;

        System.out.println(isPar.test(17));

        System.out.println(isPar.and(isTresDigitos).test(144));

    }
}
