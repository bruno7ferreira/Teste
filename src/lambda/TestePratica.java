package lambda;

import java.util.function.Predicate;

public class TestePratica {

    public static void main(String[] args) {

        Produto p7 = new Produto("MacBook M1", 6000.00, 0.10);

        Predicate<Produto> isCaro = x -> (x.preco * (1 - x.desconto)) > 7500.00;
        System.out.println(isCaro.test(p7));
    }
}
