package Exercicio21;
//Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor. Adicione métodos para cozinhar e limpar.
public class Cozinhar {
    public  String tipo;
    public int quantidadeP;
    public  String cor;

    public Cozinhar(String tipo, int quantidadeP, String cor) {
        this.tipo = tipo;
        this.quantidadeP = quantidadeP;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void cozinhar (){
        System.out.println("cozinhando");

    }
    public void limpar (){
        System.out.println("limpando");
    }
    public int getQuantidadeP() {
        return quantidadeP;
    }

    public String getCor() {
        return cor;
    }
}
