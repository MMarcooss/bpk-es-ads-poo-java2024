package Exercicio22;

public class Exercicio22 {
    public static void main(String[] args) {
        Empresa ep1 = new Empresa("fodas",1231231,120);

        ep1.adicionarF(100);
        System.out.println("numero de funcionaros contratados");
        ep1.exibirFuncionarios();

        ep1.removerF(50);
        System.out.println("numero de funcionarios que foram demetidos");
        ep1.exibirFuncionarios();
    }
}
