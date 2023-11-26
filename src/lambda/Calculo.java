package lambda;

@FunctionalInterface
public interface Calculo {


    double executar(double a, double b);

    default String hello() {
        return "Hello";
    }

    static String world() {
        return " World!";
    }


}
