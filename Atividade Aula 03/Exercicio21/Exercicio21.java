package Exercicio21;
//Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor. Adicione métodos para cozinhar e limpar.
public class Exercicio21 {
    public static void main(String[] args) {
        Cozinhar cozinha1 = new Cozinhar("novo",14,"Azul");
        System.out.println(cozinha1.tipo);

        cozinha1.cozinhar();
        cozinha1.limpar();
    }


}
