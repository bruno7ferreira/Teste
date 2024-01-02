package lambda;

import java.util.Objects;

public class Produtos {

    //atributos
    private String nome;
    private Double preco;
    private Double desconto;

    //construtor
    public Produtos(String nome, Double preco, Double desconto) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    // Método para calcular o preço real com desconto
    public Double precoComDesconto() {
        double precoComDesconto = preco - (preco * desconto);
        return 0.0;
    }

    // construtor
    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }

    // equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Objects.equals(nome, produtos.nome) && Objects.equals(preco, produtos.preco) && Objects.equals(desconto, produtos.desconto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, desconto);
    }

    // get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
