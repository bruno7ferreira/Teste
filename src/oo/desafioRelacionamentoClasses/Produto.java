package oo.desafioRelacionamentoClasses;

import java.util.List;

public class Produto {

    private int id;
    private String descricao;
    private double preco;

    private List<Item> items;

    public Produto(int id, String descricao, double preco, List<Item> items) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
