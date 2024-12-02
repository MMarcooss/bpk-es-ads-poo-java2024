package Veiculos;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected Integer ano;

    public Veiculo(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }
}
