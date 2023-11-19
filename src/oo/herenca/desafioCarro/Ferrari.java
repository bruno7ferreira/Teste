package oo.herenca.desafioCarro;


public class Ferrari extends Carro implements Esportivo, CarroLuxo {

    //construtor
    public Ferrari() {
        super(330);
        setDeltaVelocidade(15);
//        deltaVelocidade = 15;

    }

    //atributos
    boolean turboLigado = false;
    //    boolean isArLigado = false;
    boolean arLigado = false;
    int nivelArCondicionado = 0;

    //metodos
    @Override
    public void ligarTurbo() {
        if (isLigado()) {
            setDeltaVelocidade(25);
            turboLigado = true;
//            deltaVelocidade = 25;
        } else {
            System.out.println("Erro! Carro está desligado");
        }
    }

    @Override
    public void desligarTurbo() {
        turboLigado = false;
        setDeltaVelocidade(15);
//        deltaVelocidade = 15;
    }


    @Override
    public void ligarArCondionado() {

        if (isLigado()) {
            if (isLigado()) {
                arLigado = true;
                setDeltaVelocidade(getDeltaVelocidade() - 5);
//                deltaVelocidade -= 5;
                nivelArCondicionado = 1;
            }
        } else {
            System.out.println("Erro! Carro está desligado");
        }
    }


    @Override
    public void desligarArCondicionado() {
        if (arLigado) {
            arLigado = false;

            if (!arLigado) {
                setDeltaVelocidade(getDeltaVelocidade() + 5);
//                deltaVelocidade += 5;
            }
        } else {
            System.out.println("ArCondicionado já está desligado!");
        }
    }

    @Override
    public void arCondicionadoStatus() {
        if (arLigado) {
            System.out.println("Ar-Condionado está ligado!");
            System.out.println(velocidadeAr());
        } else {
            System.out.println("Ar-Condicionado está desligado");
        }
    }

    @Override
    public int velocidadeAr() {
        return nivelArCondicionado;
    }

    @Override
    public int aumentarArCondionado() {
        if (arLigado) {
            return nivelArCondicionado++;
        } else {
            return 0;
        }

    }

    @Override
    public int reduzirArCondicionado() {
        if (nivelArCondicionado > 0) {
            return nivelArCondicionado--;
        } else {
            return 0;
        }
    }

    @Override
    public int getDeltaVelocidade() {
        if (turboLigado && !arLigado) {
            return 25;
        } else if (turboLigado && arLigado) {
            return 20;
        } else if (!turboLigado && arLigado) {
            return 10;
        } else if (!turboLigado && !arLigado) {
            return 15;
        }
        return 15;
    }

    @Override
    public void desligarCarro() {
        if (velocidade == 0) {
            ligado = false;
            deltaVelocidade = this.deltaVelocidade;
            nivelArCondicionado = 0;
        } else {
            System.out.println("Não é possível desligar o carro em movimento");
        }
    }
}
