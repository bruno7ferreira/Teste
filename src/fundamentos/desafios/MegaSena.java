package fundamentos.desafios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        // Gerar 6 números aleatórios entre 1 e 60 (inclusive)
        int[] numerosMegaSena = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            numerosMegaSena[i] = random.nextInt(60) + 1;
        }

        // Ordenar os números em ordem crescente
        Arrays.sort(numerosMegaSena);

        // Salvar os números na área de trabalho em um arquivo de texto
        String caminhoArquivo = System.getProperty("user.home") + "/Desktop/numeros_mega_sena.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("Números da Mega-Sena gerados em ordem crescente:\n");
            for (int numero : numerosMegaSena) {
                writer.write(numero + "\n");
            }
            System.out.println("Números gerados e salvos na área de trabalho: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os números: " + e.getMessage());
        }
    }
}





