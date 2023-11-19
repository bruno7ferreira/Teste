package oo.polimofismo;

public class Jantar {

    public static void main(String[] args) {


        Pessoa convidade = new Pessoa(74.41);

        Arroz ingrediente = new Arroz(10.0);
        Feijao ingrediente2 = new Feijao(5.0);

        convidade.comer(ingrediente);
        convidade.comer(ingrediente2);

        Sorvete sobremesa = new Sorvete(3.0);
        convidade.comer(sobremesa);


        System.out.println(convidade.getPeso());;


    }
}
