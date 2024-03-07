package streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        //cria uma funcao para usar no lugar System.out::println
        Consumer<String> print = System.out::println;

        //cria uma stream ja passando os valores
        Stream<String> languagens = Stream.of("Java", "MySql", "HTML/n");




    }
}
