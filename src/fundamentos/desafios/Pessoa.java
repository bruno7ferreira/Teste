package fundamentos.desafios;

public class Pessoa {

    String nome;
    int idade;
    char sexo;
    double peso;

    public Pessoa(String nome, int idade, char sexo, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
    }

    public Comida comerComida(Comida comida){
        System.out.println(nome+" comeu "+comida.nome);
        peso += comida.calorias;
        return comida;
    }

    public Pessoa exibirPeso(Pessoa pessoa){
        System.out.printf(" "+" peso atual é de %.2f Kg %n ",this.peso);
        return pessoa;
    }


}
