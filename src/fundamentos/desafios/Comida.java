package fundamentos.desafios;

public class Comida {

    String nome;
    double calorias;

    @Override
    public String toString() {
        return "Comida{" +
                "nome='" + nome + '\'' +
                ", calorias=" + calorias +
                '}';
    }

    public Comida(String nome, double calorias) {
        this.nome = nome;
        this.calorias = calorias;
    }
}
