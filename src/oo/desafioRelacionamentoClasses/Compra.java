package oo.desafioRelacionamentoClasses;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private int id;
    private Cliente cliente;
    private List<Item> itens;

    public Compra(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();

    }

    public void adicionarItem(Item item) {
        itens.add(item);

    }

    public double obterValorTotal() {
        double total = 0;
        for (Item c : itens) {
            total += c.getQuantidade() * c.getProduto().getPreco();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }


}
