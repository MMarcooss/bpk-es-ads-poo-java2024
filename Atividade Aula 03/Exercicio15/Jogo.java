package Exercicio15;
//Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.
public class Jogo {
    public String nome;
    public String genero;
    public Double preco;

    public Jogo(Double preco, String genero, String nome) {
        this.preco = preco;
        this.genero = genero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getGenero() {
        return genero;
    }

    public void IniciarJ(){
        System.out.println("Iniciando Jogo...");
    }
    public void PausarJ(){
        System.out.println("Pausar Jogo");
    }
}
