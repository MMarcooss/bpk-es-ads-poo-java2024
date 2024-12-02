package cadastroPessoa;


import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private Integer idade;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade, Endereco endereco ) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<>();
        this.enderecos.add(endereco);
    }

    public List<Endereco> getEndereco() {
        return enderecos;
    }

    @Override
    public String toString() {
       if (this.enderecos.isEmpty()){return """
                Nome: %s
                Idade: %s
                Endereco: %s
                """.formatted(nome,idade);
         }else {
           String dadosPessoais = "Nome" + nome + "\n" +
                   "Idade" + idade +
                   "Endereco" + enderecos;

                   return dadosPessoais;
       }

    }
}
