package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> listaCarros =
                () -> Arrays.asList("Gol", "Bravo", "GTR");
        System.out.println(listaCarros.get());


        Supplier<String> carro =
                () -> "GTR";

        System.out.println(carro.get());

        Supplier<Double> dinheiro =
                () -> 545000000.00;

        System.out.println("Grana "+dinheiro.get());


        Supplier<List<Integer>> listaIdade =
                () -> Arrays.asList(110, 120);
        System.out.println(listaIdade.get());


        List<Integer> numsMega = Arrays.asList(7, 14);
        System.out.println("mega: " + numsMega);

        Supplier<String> name = () -> "Texto do supplier \n _________";

        Supplier<List<String>> goals =
                () -> Arrays.asList("house", "business", "trip", "cars");

        System.out.println(goals.get());

        Supplier<List<String>> teste = () -> Arrays.asList("Bruno");

        System.out.println(teste.get() + " 7 \n" + " ok");

    }

}
