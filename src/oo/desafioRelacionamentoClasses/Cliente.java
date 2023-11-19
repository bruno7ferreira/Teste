package oo.desafioRelacionamentoClasses;

import java.util.ArrayList;

public class Cliente {

    private int id;
    private String nome;
    private ArrayList<Compra> compras;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.compras = new ArrayList<>();
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public double obterValorTotal() {
        double valor = 0;

        for (Compra c : compras) {
            valor += c.obterValorTotal();        }
        return valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
}
