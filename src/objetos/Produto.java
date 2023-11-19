package objetos;

import java.util.Objects;

public class Produto {

    public String nome;
    public double preco;
    public double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public Produto (){

    }

    public double precoComDesconto() {

        return preco * (1 - desconto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 && Double.compare(produto.desconto, desconto) == 0 && nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, desconto);
    }
}
