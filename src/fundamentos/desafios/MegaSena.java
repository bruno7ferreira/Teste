package fundamentos.desafios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        // Gerar 6 n�meros aleat�rios entre 1 e 60 (inclusive)
        int[] numerosMegaSena = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            numerosMegaSena[i] = random.nextInt(60) + 1;
        }

        // Ordenar os n�meros em ordem crescente
        Arrays.sort(numerosMegaSena);

        // Salvar os n�meros na �rea de trabalho em um arquivo de texto
        String caminhoArquivo = System.getProperty("user.home") + "/Desktop/numeros_mega_sena.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("N�meros da Mega-Sena gerados em ordem crescente:\n");
            for (int numero : numerosMegaSena) {
                writer.write(numero + "\n");
            }
            System.out.println("N�meros gerados e salvos na �rea de trabalho: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os n�meros: " + e.getMessage());
        }
    }
}





