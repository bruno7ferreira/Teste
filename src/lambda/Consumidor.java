package lambda;

import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = x -> System.out.println(x.nome);


        Produto prod1 = new Produto("GTR", 700.00, 0.5);
        imprimir.accept(prod1);


    }
}
