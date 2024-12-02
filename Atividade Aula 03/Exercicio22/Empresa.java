package Exercicio22;
//Defina uma classe Empresa com atributos como nome, CNPJ, e numeroFuncionarios. Adicione métodos para contratar e demitir funcionários.
public class Empresa {

    public String nome;
    public double cnpj;
    public int numerofuncionarios;

    public Empresa(String nome, double cnpj, int numerofuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numerofuncionarios = numerofuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public int getNumerofuncionarios() {
        return numerofuncionarios;
    }

    public double getCnpj() {
        return cnpj;
    }

    public void adicionarF(int quantidade) {
        if (quantidade > 0) {
            this.numerofuncionarios += quantidade;
        } else {
            System.out.println("quantidade invalida");
        }
    }

    public void removerF(int quantidade) {
        if (quantidade > 0 && this.numerofuncionarios >= quantidade) {
            this.numerofuncionarios = this.numerofuncionarios - quantidade;
        } else {
            System.out.println("Quantidade inválida ou população insuficiente para diminuir.");
        }
    }

    public void exibirFuncionarios() {
        System.out.println("Numero de jogadores: " + numerofuncionarios);

    }
}
