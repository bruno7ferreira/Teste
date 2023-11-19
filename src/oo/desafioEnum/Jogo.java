package oo.desafioEnum;

public class Jogo {

    public static void main(String[] args) {

        Jogador player1 = new Jogador();
        player1.x = 10;
        player1.y = 10;

        Jogador player2 = new Jogador();
        player2.x = 10;
        player2.y = 11;

        System.out.println(player1.vida);
        System.out.println(player2.vida);
        System.out.println( player1.atacar(player2));

        System.out.println(player2.vida);










    }
}
