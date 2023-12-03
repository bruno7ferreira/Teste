package lambda;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 6500.00, 0.10);
        Predicate<Produto> isCaro = cont -> (cont.preco * (1 - cont.desconto)) >= 7000.00;
        System.out.println(isCaro.test(p1));

        Predicate<Produto> isBarato = c -> (c.preco * (1 - p1.desconto)) <= 6500;
        System.out.println(isBarato.test(p1));

        Predicate<Produto> qtsLetras = var -> var.nome.length() > 3;
        System.out.println(qtsLetras.test(p1));


        Predicate<Produto> descontoValor = var -> var.desconto > 0.5;
        System.out.println(descontoValor.test(p1));

    }
}
