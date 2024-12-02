package Exercicio12;
//Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.
public class Filme {
    public String titulo;
    public  String diretor;
    public  String direcao;

    public Filme(String titulo, String direcao, String diretor) {
        this.titulo = titulo;
        this.direcao = direcao;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirecao() {
        return direcao;
    }

    public String getDiretor() {
        return diretor;
    }


    public void IniciarFilme (){
        System.out.println("Iniciando Filme...");
    }

    public void Pararfilme (){
        System.out.println("Pararando Filme...");
    }
}
