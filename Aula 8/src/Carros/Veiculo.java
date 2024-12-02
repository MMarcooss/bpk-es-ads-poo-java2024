package Carros;

public class Veiculo {

    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }


}
