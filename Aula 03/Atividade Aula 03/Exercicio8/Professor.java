package Exercicio8;
//Crie uma classe Professor com atributos nome, disciplina, e salario. Adicione métodos para dar aula e corrigir provas.
public class Professor {
    public String nome;
    public  String diciplina;
    public  float salario;

    public Professor(String nome, float salario, String diciplina) {
        this.nome = nome;
        this.salario = salario;
        this.diciplina = diciplina;
    }

    public void daraula(){
        System.out.println("O professor" + nome + "Esta dando aula");
    }
    public void corrigindo(){
        System.out.println("O professor esta corrigindo as provas de " + diciplina );
    }
}
