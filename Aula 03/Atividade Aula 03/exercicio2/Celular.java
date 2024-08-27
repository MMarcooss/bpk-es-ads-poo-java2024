package exercicio2;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidadebateria;
    public boolean celularLigado = false;


public Celular(){
}

    public Celular(String marca, String modelo, int capacidadebateria) {

    this.marca = marca;
    this.modelo = modelo;
    this.capacidadebateria = capacidadebateria;
    }

    public void ligarCelular (){   //imperativo
        this.celularLigado = true;   // this para acessar proriedade na instancia
    }

    public void desligarCelular(){
        this.celularLigado = false;
    }

}
