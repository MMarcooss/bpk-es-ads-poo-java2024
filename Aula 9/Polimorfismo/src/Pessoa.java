import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;

    private List<IContaBancaria> contas;

    public Pessoa(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void criarConta(IContaBancaria iContaBancaria) {
        contas.add(iContaBancaria);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (IContaBancaria conta : contas) {
            sb.append(conta).append("\n");

        }
        return " Nome "+ nome + sb.toString();
    }
}

