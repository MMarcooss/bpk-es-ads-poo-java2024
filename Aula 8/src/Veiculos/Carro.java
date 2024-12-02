package Veiculos;

public class Carro extends Veiculo {

    private Integer numeroPortas;

    public Carro(String marca, int ano, String modelo) {
        super(marca, ano, modelo);
    }

    @Override
    public String toString() {
        return "Veiculos.Carro{" +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
