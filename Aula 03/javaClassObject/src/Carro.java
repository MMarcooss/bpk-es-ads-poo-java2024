public class Carro {
    public String modelo;
    public String marca;
    public String cor;
<<<<<<< HEAD
    public int potencia;
    public  double preco;
    public int velocidade;
=======
    public int ano;
>>>>>>> 17b181c933cd0ffded5f491f0ea530e306cf7424

//    public Carro() {
//    }

<<<<<<< HEAD
    public Carro(String modelo, String marca, int ano, String cor, int potencia, double preco, int velocidade) {
=======
    public Carro(String modelo, String marca, String cor, int ano) {
>>>>>>> 17b181c933cd0ffded5f491f0ea530e306cf7424
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
<<<<<<< HEAD
        this.potencia = potencia;
        this.preco = preco;
        this.velocidade = velocidade;
=======
        this.ano = ano;
>>>>>>> 17b181c933cd0ffded5f491f0ea530e306cf7424
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", potencia=" + potencia +
                ", preco=" + preco +
                ", velocidade=" + velocidade +
                '}';
=======
        return """
                """;
//        return marca + " " + modelo + " " + cor + " " + ano;
>>>>>>> 17b181c933cd0ffded5f491f0ea530e306cf7424
    }
}