package lambda;

public class MainCalculadora {

    public static void main(String[] args) {

        Calculo soma = new Somar();
        Calculo multiplicacao = new Multiplicacao();

        System.out.println(soma.executar(10, 5));
        System.out.println(multiplicacao.executar(10, 5));

        Calculo sub = new Subtracao();
        System.out.println(sub.executar(20, 5));

        System.out.println(sub.hello() + Calculo.world());
    }
}
