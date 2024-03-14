package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bruno", "Maria CLara", "Alexandra", "Lucicleia",
                "Paulo Marcello", "Clara Luanny", "Gustavo");

        Stream<String> br = aprovados.stream();
        br.forEach(System.out::println);

        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }


        // usando forEach
        for (String x : aprovados) {
            System.out.println(x);
        }


        System.out.println("-------------");

        Iterator<String> xx = aprovados.iterator();
        while (xx.hasNext()) {
            System.out.println(xx.next());
        }


        // usando Iterator
        Iterator<String> x = aprovados.iterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }

        System.out.println("+++++++");
        List<String> cars = Arrays.asList("Gol", "Bravo", "BMW", "GTR");
        Iterator<String> nomeLista = cars.listIterator();
        while (nomeLista.hasNext()) {
            System.out.println(nomeLista.next());
        }

        System.out.println(":::");
        Stream<String> listCars = cars.stream();
        listCars.forEach(System.out::println);

        System.out.println("===");
        Consumer<String> print = System.out::println;
        Stream<String> bb = aprovados.stream();
        bb.forEach(print);


    }
}
