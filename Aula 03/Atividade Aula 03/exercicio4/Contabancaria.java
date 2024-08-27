package exercicio4;

    public class Contabancaria {
    private int numeroconta;
    private double saldo;

    public Contabancaria(int numeroconta, double saldo) {
        this.numeroconta = numeroconta;
        this.saldo = saldo;
    }
    public Integer getnumeroconta(){
        return numeroconta;
    }
    public double getSaldo(){
        return  saldo;
    }
    public void sacar(double valor){
        this.saldo = saldo -valor;
    }
}
