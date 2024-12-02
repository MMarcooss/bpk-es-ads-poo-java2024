public class ContaCorrente extends ContaBancaria implements IContaBancaria {


    public ContaCorrente(int numero, double saldo, Banco banco) {
        super(numero, saldo, banco);
    }


    @Override
    public void sacar (double valor){
        if (saldo >= valor){
            saldo =- valor;
            System.out.println("Saque de R$" + valor + "realizado com sucesso");
        }
    }


    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "banco=" + banco +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}

