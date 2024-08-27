package Exercicio14;
//Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores. Adicione métodos para adicionar e remover jogadores.
public class Time {
    public String nome;
    public String tecnico;
    public int numeroJogadores;

    public Time(String nome, int numeroJogadores, String tecnico) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void adicionarJ(int quantidade) {
        if (quantidade > 0) {
            this.numeroJogadores += quantidade;
        } else {
            System.out.println("quantidade invalida");
        }
    }

    public void removerJ(int quantidade) {
        if (quantidade > 0 && this.numeroJogadores >= quantidade) {
            this.numeroJogadores = this.numeroJogadores - quantidade;
        } else {
            System.out.println("Quantidade inválida ou população insuficiente para diminuir.");
        }
    }

    public void exibirInformacoesJogadores() {
        System.out.println("Time: " + nome);
        System.out.println("Numero de jogadores: " + numeroJogadores);
        System.out.println("Tecnico: " + tecnico);
    }
}

