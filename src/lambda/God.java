package lambda;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class God {

    public static void main(String[] args) {


        // Criando lista de números
        List<Integer> numbersAlexandra = Arrays.asList(4, 5, 8, 9, 10, 11, 12, 15, 17, 18, 23, 24, 27, 28, 30,
                31, 32, 37, 42, 46, 47, 49, 51, 52, 53, 58);

//        // convertendo lista para um array
//        Integer[] listNumbers = numbers.toArray(new Integer[0]);

        // Embaralha a lista para garantir aleatoriedade na seleção
        Collections.shuffle(numbersAlexandra);

        // Quantidade de elementos a ser selecionados
        int quantidadeDeNumeros = 6;

        // Lista para armazenar os números selecionados
        List<Integer> numerosAlexandra = new ArrayList<>();

        // Seleciona os primeiros 6 elementos da lista embaralhada
        for (int i = 0; i < quantidadeDeNumeros; i++) {
            numerosAlexandra.add(numbersAlexandra.get(i));
        }

//        // Ordenar os números em ordem crescente
//        Arrays.sort(numerosAlexandra);

        // Salvar os números na área de trabalho em um arquivo de texto
        String caminhoArquivo = System.getProperty("user.home") + "/Desktop/numeros_mega_sena_Alexandra.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("Números da Mega-Sena gerados em ordem crescente:\n");
            for (int numero : numerosAlexandra) {
                writer.write(numero + "\n");
            }
            System.out.println("Números gerados e salvos na área de trabalho: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os números: " + e.getMessage());
        }

    }
}
