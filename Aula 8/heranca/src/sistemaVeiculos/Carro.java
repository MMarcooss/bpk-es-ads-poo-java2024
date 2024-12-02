package sistemaVeiculos;

public class Carro extends Veiculo {

    private Integer numeroPortas;

    public Carro(String marca, int ano, String modelo, Integer numeroPortas) {
        super(marca, ano, modelo);
        this.numeroPortas = numeroPortas;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String toString() {
        return "sistemaVeiculos.Veiculo{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() +
                ", numeroporta" + getNumeroPortas() +

                '}';
    }



}
