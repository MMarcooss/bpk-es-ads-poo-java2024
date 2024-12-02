package exercicio4;

    public class Contabancaria {
    private int numeroconta;
    private double saldo;

    public Contabancaria(int numeroconta, double saldo) {
        this.numeroconta = numeroconta;
        this.saldo = 0.0;
    }
    public Integer getnumeroconta(){
        return numeroconta;
    }
    public double getSaldo(){
        return  saldo;
    }
    public void sacar(double valor){
        if (saldo > valor){
            System.out.println("Vc nao tem saldo suficiente");

        }else {
            this.saldo = saldo -valor;
        }
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }else {
            System.out.println("quantidade invalida");
        }
        }
    }

