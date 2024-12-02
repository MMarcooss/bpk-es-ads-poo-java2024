package sistemaVeiculos;

public class Moto extends Veiculo {

 private TipoPartida tipoPartida;

    public Moto(String marca, int ano, String modelo) {
        super(marca, ano, modelo);
    }

    public Moto(String marca, int ano, String modelo, TipoPartida tipoPartida) {
        super(marca, ano, modelo);
        this.tipoPartida = tipoPartida;
    }

    public void acelerar(){
        System.out.println("Acelerar");
    }

    public void frear(){
        System.out.println("Frear");
    }

    public void empinar(){
        System.out.println("Empinando");
    }

    @Override
    public String toString() {
        return "sistemaVeiculos.Veiculo{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() +

                '}';
    }

}
