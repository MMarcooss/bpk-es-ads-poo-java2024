package Exercicio17;

public class Exercicio17 {
    public static void main(String[] args) {
        Animal cachorro = new Animal("viralata",64,12);
        System.out.println(cachorro.getEspecie());

        cachorro.alimentar();
        cachorro.dormir();

    }


}
