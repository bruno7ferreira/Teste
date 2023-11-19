package oo.herenca.desafioCarro;

import java.util.Objects;

public class Carro {

    protected final int VELOCIDADE_MAXIMA;
    protected int velocidade;
    protected int deltaVelocidade = 5;
    protected boolean ligado;

    public Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
        this.velocidade = 0;
        this.ligado = false;
    }


    public void statusCarro() {
        System.out.println("Velocidade = " + getVelocidade());
        if (isLigado()) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro desligado");
        }
    }


    public void acelerar() {
        if (ligado) {
            if ((getVelocidade() + getDeltaVelocidade()) >= VELOCIDADE_MAXIMA) {
                setVelocidade(VELOCIDADE_MAXIMA);
//                velocidade = VELOCIDADE_MAXIMA;
            } else {
                setVelocidade(getVelocidade() + getDeltaVelocidade());
//                velocidade += deltaVelocidade;
            }
        } else {
            System.out.println("Erro! O carro está desligado");
        }
    }

    public void freiar() {
        if (getVelocidade() >= getDeltaVelocidade()) {
            setVelocidade(getVelocidade() - getDeltaVelocidade());
//            velocidade -= deltaVelocidade;
        } else if (getVelocidade() >= 0 && getVelocidade() < getDeltaVelocidade()) {
//            velocidade = 0;
            setVelocidade(0);
        }
    }

    public void ligarCarro() {
        ligado = true;
    }

    public void desligarCarro() {
        if (velocidade == 0) {
            ligado = false;
            deltaVelocidade = this.deltaVelocidade;
        } else {
            System.out.println("Não é possível desligar o carro em movimento");
        }
    }

    // get and set

    public boolean isLigado() {
        return ligado;
    }


    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDeltaVelocidade() {
        return deltaVelocidade;
    }

    public void setDeltaVelocidade(int deltaVelocidade) {
        this.deltaVelocidade = deltaVelocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "VELOCIDADE_MAXIMA=" + VELOCIDADE_MAXIMA +
                ", velocidade=" + velocidade +
                ", deltaVelocidade=" + deltaVelocidade +
                ", ligado=" + ligado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return velocidade == carro.velocidade && deltaVelocidade == carro.deltaVelocidade && ligado == carro.ligado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidade, deltaVelocidade, ligado);
    }
}
