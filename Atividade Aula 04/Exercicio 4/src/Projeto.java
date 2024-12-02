import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String descricao;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public double calcularProgresso() {
        if (tarefas.isEmpty()) {
            return 0.0;
        }
        long tarefasConcluidas = tarefas.stream().filter(Tarefa::isConcluida).count();
        return (double) tarefasConcluidas / tarefas.size() * 100;
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Projeto: ").append(nome).append("\n");
        relatorio.append("Descrição: ").append(descricao).append("\n");
        relatorio.append("Progresso: ").append(String.format("%.2f", calcularProgresso())).append("%\n");
        relatorio.append("Tarefas:\n");

        for (Tarefa tarefa : tarefas) {
            relatorio.append("- ").append(tarefa.getTitulo())
                    .append(" (Responsável: ").append(tarefa.getResponsavel().getNome()).append(")")
                    .append(tarefa.isConcluida() ? " [Concluída]" : " [Pendente]").append("\n");
        }

        return relatorio.toString();
    }
}
