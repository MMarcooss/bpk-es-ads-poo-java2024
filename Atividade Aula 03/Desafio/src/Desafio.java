public class Desafio {
    public class ContaCorrente {
        private int numeroConta;
        private String titular;
        private double saldo;
        private double limiteSaque;

        // ... construtores, getters e setters ...

        public void sacar(double valor) {
            if (valor <= saldo + limiteSaque) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }

        // ... outros métodos ...
    }

    public class Cliente {
        private String nome;
        private String cpf;
        private List<ContaCorrente> contas = new ArrayList<>();

        // ... construtores, getters e setters ...

        public void adicionarConta(ContaCorrente conta) {
            contas.add(conta);
        }

        // ... outros métodos ...
    }
}
