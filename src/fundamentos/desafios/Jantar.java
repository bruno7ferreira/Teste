package fundamentos.desafios;

public class Jantar {

    public static void main(String[] args) {


        Pessoa p1 = new Pessoa("Bruno",32,'m',74);

        Comida c1 = new Comida("Macarrao",0.400);
        Comida c2 = new Comida("Picanha",1.20);

        p1.comerComida(c1);
        p1.exibirPeso(p1);
        p1.comerComida(c2);
        p1.exibirPeso(p1);

    }

}
