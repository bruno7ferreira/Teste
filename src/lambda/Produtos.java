package lambda;

import java.util.Objects;

public class Produtos {

    //atributos
    private final String nome;
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
    public Double calcularPrecoComDesconto() {
        double precoComDesconto = preco - (preco * desconto);
        return precoComDesconto;
    }

    // Método para calcular o imposto municipal
    public double calcularImpostoMunicipal() {
        double precoComDesconto = calcularPrecoComDesconto();

        if (precoComDesconto >= 2500) {
            return precoComDesconto * 0.085;  // 8,5% de imposto
        } else {
            return 0;  // Isento de imposto
        }
    }

    // Método para calcular frete
    public double calcularFrete(double valor) {
        double precoFrete = valor;
        if (preco >= 3000) {
            precoFrete = valor;
        } else {
            precoFrete = valor / 2;
        }
        return precoFrete;
    }

    // método toString
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
