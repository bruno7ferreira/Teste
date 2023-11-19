package oo.polimofismo;

public abstract class Comida {

    private double peso;

    public Comida(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
        System.out.println("Erro! você informou um valor negativo");
    }
}
