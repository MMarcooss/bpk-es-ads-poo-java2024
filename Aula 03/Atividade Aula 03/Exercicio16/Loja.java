package Exercicio16;
//Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.
public class Loja {
    public String nome;
    public  String endereco;
    public float Telefone;

    public Loja(int telefone, String endereco, String nome) {
        Telefone = telefone;
        this.endereco = endereco;
        this.nome = nome;
    }

    public Loja(String nome, int telefone, String endereco) {
        this.nome = nome;
        Telefone = telefone;
        this.endereco = endereco;
    }
    public void abrirloja(){

        System.out.println("Abrindo Loja...");
    }
    public void fechandoLoja(){
        System.out.println("Fechando loja");
    }
}
