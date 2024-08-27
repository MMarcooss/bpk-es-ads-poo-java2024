package Exercicio5;
    public class Cachorros {
        public String raca;
        public int idade;
        public String nome;


        public Cachorros(String raca, int idade, String nome) {
            this.raca = raca;
            this.idade = idade;
            this.nome = nome;

        }

        public void latir() {
            System.out.println(nome + " está latindo: Au Au!");
        }

        public void correr() {
            System.out.println(nome + " está correndo!");
        }

    }




