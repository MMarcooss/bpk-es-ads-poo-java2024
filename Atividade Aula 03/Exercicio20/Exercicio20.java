package Exercicio20;

public class Exercicio20 {
    public static void main(String[] args) {
        Bicicleta bice = new Bicicleta("totem",45,"novo");
        System.out.println(bice.modelo);

        bice.frear();
        bice.pedalar();
    }
}
