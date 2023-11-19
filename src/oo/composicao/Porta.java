package oo.composicao;

public class Porta {

    int quantidade;
    boolean portaAberta = false;

    void abrirPorta(){
        portaAberta = true;
    }

    void fecharPorta(){
        portaAberta = false;
    }

    boolean statusPortaAberta() {
        return portaAberta;
    }


    public Porta(int quantidade) {
        this.quantidade = quantidade;
    }
}
