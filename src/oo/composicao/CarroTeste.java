package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c = new Carro();
        c.portas.add(new Porta(4));
        c.portas.add(new Porta(4));

        System.out.println(c.portas.size());



    }
}
