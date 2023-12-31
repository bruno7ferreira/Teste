package lambda;

public class MainCalculadora2 {

    public static void main(String[] args) {

        Calculo sub = new Somar();
        //expressão lambda
        Calculo calcSoma = (a, b) -> {
            return a + b;
        };
        System.out.println(calcSoma.executar(15, 5));

        Calculo calcMulti = (x, y) -> {
            return x * y;
        };
        System.out.println(calcMulti.executar(15, 5));

        Calculo calcDiv = (a, b) -> a / b;

        System.out.println(calcDiv.executar(10, 10));

        Calculo calcSub = (x, y) -> x - y;

        System.out.println(calcSub.executar(10, 5));
        System.out.println("*");

        System.out.println(sub.hello() + Calculo.world());
    }
}
