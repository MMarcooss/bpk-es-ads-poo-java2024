public class ContaBancaria {

    protected int numero;
    protected   double saldo;
    protected   Banco banco;


    public ContaBancaria(int numero, double saldo, Banco banco) {
        this.numero = numero;
        this.saldo = saldo;
        this.banco = banco;
    }
}
