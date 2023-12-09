package lambda;

public class Produto extends Object {

    final String nome;
    final Double preco;
    final Double desconto;

    public Produto(String nome, Double preco, Double desconto) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
}
