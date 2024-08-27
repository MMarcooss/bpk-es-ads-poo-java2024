package exercicio3;

public class Pessoa {
    public String nome;
    public int idade;
    public  double altura;

public Pessoa (){
}
public Pessoa(String nome, int idade, double altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
}

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

