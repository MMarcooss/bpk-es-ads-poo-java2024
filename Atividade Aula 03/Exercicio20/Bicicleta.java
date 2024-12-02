package Exercicio20;
//Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda. Adicione métodos para pedalar e frear.
public class Bicicleta {
    public String marca;
    public String modelo;
    public  int tamanhoRoda;

    public Bicicleta(String marca, int tamanhoRoda, String modelo) {
        this.marca = marca;
        this.tamanhoRoda = tamanhoRoda;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public String getModelo() {
        return modelo;
    }

    public void pedalar (){
        System.out.println("Pedalando");
    }

    public void frear(){
        System.out.println("Freinhando");
    }
}
