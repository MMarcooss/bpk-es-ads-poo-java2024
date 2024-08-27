package Exercicio11;

//11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.
public class Cidade {
    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            this.populacao += quantidade;
        } else {
            System.out.println("Quantidade inválida para aumentar a população.");
        }
    }


    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && this.populacao >= quantidade) {
            this.populacao -= quantidade;
        } else {
            System.out.println("Quantidade inválida ou população insuficiente para diminuir.");
        }
    }


    public void exibirInformacoes() {
        System.out.println("Cidade: " + nome);
        System.out.println("População: " + populacao);
        System.out.println("Estado: " + estado);
    }
}


