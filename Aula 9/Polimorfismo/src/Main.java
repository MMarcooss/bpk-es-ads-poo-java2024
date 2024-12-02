public class Main
{
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João");
        pessoa.criarConta(new ContaCorrente(1,200,Banco.NUBANK));

        System.out.println(pessoa);


    }
}
