package oo.composicao;

public class Motor {


    boolean ligado = false;
    double favorInjecao = 1;

    int giros() {
        if (!ligado) {

            return 0;
        } else {
            return (int) (favorInjecao * 3000);

        }
    }


}
