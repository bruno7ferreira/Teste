package oo.herenca.desafioCarro;

public class MainSistemaCarro {


    public static void main(String[] args) {

        Carro fusca = new Carro(160);
        Civic g10 = new Civic();


        Ferrari f50 = new Ferrari();
//        System.out.println(f50.deltaVelocidade);


        System.out.println(f50.getVelocidade());
        System.out.println(f50.getDeltaVelocidade());
        System.out.println("---");
        f50.ligarCarro();
        f50.ligarTurbo();
        f50.arCondicionadoStatus();
        f50.ligarArCondionado();
        f50.desligarTurbo();
        f50.desligarArCondicionado();
        f50.desligarCarro();
        System.out.println(f50.getDeltaVelocidade());
        f50.statusCarro();
        System.out.println(f50.velocidadeAr());

        f50.ligarCarro();
        f50.ligarArCondionado();
        f50.aumentarArCondionado();
        f50.aumentarArCondionado();
        System.out.println("-- "+f50.velocidadeAr());
        System.out.println(f50.arLigado);
        f50.arCondicionadoStatus();
        f50.aumentarArCondionado();
        f50.arCondicionadoStatus();
        f50.reduzirArCondicionado();
        f50.arCondicionadoStatus();
        f50.reduzirArCondicionado();
        f50.reduzirArCondicionado();
        f50.reduzirArCondicionado();
        f50.reduzirArCondicionado();
        f50.reduzirArCondicionado();
        f50.reduzirArCondicionado();
        f50.arCondicionadoStatus();
    }
}
