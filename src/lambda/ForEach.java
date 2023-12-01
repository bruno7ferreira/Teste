package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> listaCarros = new ArrayList<>();
        listaCarros.add("lexus");
        listaCarros.add("gtr");
        listaCarros.add("Amarok");
        listaCarros.add("seal");

//        System.out.println(listaCarros);

        List<String> carros = Arrays.asList("Lexus", "Seal", "GTR", "Hilux");

        for (String car : carros) {
            System.out.println(car);
        }
        System.out.println("---------");
        listaCarros.forEach((cont) -> {
            System.out.println(cont);
        });
        System.out.println("---------");

        listaCarros.forEach(cont -> System.out.println(cont));
        System.out.println("---------");
        listaCarros.forEach(System.out::println);

    }

}

