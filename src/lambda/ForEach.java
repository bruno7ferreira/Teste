package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {


        List<String> carros = Arrays.asList("Lexus", "Seal", "GTR", "Hilux");

        System.out.println("Tradicional");
        for (String car : carros) {
            System.out.println(car);
        }

        System.out.println("ForEach 1");
        System.out.println("---------");
        carros.forEach((car) -> {
            System.out.println(car);
        });

        System.out.println("ForEach 2");
        carros.forEach(car -> System.out.println(car));

        System.out.println("Por referencia");
        carros.forEach(System.out::println);

//        static void meuImprimir (String car){
//            System.out.println("Meu carro é " + car);
//        }

    }

}

