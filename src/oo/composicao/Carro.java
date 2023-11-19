package oo.composicao;

import java.util.ArrayList;

public class Carro {


    Motor motor = new Motor();
    ArrayList<Porta> portas = new ArrayList<>(4);

    void acelerar() {

        motor.favorInjecao += 0.4;
    }

    void frear() {
        motor.favorInjecao -= 0.4;
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estarLigado() {
        return motor.ligado;
    }
}
