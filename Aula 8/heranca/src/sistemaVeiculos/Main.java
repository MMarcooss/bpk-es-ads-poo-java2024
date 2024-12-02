package sistemaVeiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Golbolinha",2000,"teste",2);

        System.out.println(carro);

        Moto moto1 = new Moto("Cg",1992,"novo",TipoPartida.ELETRICO);
        System.out.println(moto1);
        moto1.acelerar();
        moto1.frear();
        moto1.empinar();

    }
}
