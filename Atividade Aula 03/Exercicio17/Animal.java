package Exercicio17;
//Implemente uma classe Animal com atributos especie, idade, e peso. Adicione métodos para alimentar e dormir.
public class Animal {
    private String especie;
    private int idade;
    private float peso;

    public Animal(String especie, float peso, int idade) {
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public float getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public  void alimentar(){
        System.out.println(this.especie + "Alimentando cachorro");
    }
    public void dormir(){
        System.out.println(this.especie + "dormindo");
    }
}
