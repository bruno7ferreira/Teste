package lambda;

import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        // consumer = aceita um argumento do tipo especificado e não retorna nenhum resultado.

        Consumer<Produto> imprimir = x -> System.out.println(x.nome);


        Produto prod1 = new Produto("GTR", 700.00, 0.5);
        imprimir.accept(prod1);


    }
}
