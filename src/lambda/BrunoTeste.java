package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BrunoTeste {

    public static void main(String[] args) {


        Produto p1 = new Produto("Casa", 300.00, 0.10);
        Produto p2 = new Produto("GTR", 700.00, 0.15);
        Produto p3 = new Produto("Mansão", 1300.00, 0.5);

        List<Produto> produtosB = new ArrayList<>(List.of(p1, p2, p3));

        produtosB.forEach(x -> System.out.println(x.nome));

        Predicate<Produto> isCaro = x -> x.preco >= 500;

        System.out.println("------");
        Consumer<Produto> produtos = x -> System.out.println("Nome " + x.nome + " R$ ->" + x.preco + " 'Desconto'" + x.desconto);
        produtos.accept(p1);


        Consumer<Produto> fac = y -> System.out.println(y.nome);
        fac.accept(p2);



    }
}
