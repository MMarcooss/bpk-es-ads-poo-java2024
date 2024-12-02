import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario usuario1 = new Usuario("João Silva", "joao@email.com");
        Usuario usuario2 = new Usuario("Maria Oliveira", "maria@email.com");

        // Criando projeto
        Projeto projeto = new Projeto("Desenvolvimento de Sistema", "Criação de um sistema de gestão de tarefas.");

        // Criando tarefas
        Tarefa tarefa1 = new Tarefa("Planejar Estrutura", "Definir arquitetura e modelo de dados.",
                LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 5), usuario1);
        Tarefa tarefa2 = new Tarefa("Implementar Backend", "Desenvolver a API e banco de dados.",
                LocalDate.of(2024, 12, 6), LocalDate.of(2024, 12, 15), usuario2);
        Tarefa tarefa3 = new Tarefa("Criar Frontend", "Desenvolver a interface gráfica.",
                LocalDate.of(2024, 12, 16), LocalDate.of(2024, 12, 30), usuario1);

        // Adicionando tarefas ao projeto
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);
        projeto.adicionarTarefa(tarefa3);

        // Marcando tarefas como concluídas
        tarefa1.marcarComoConcluida();

        // Gerando relatório do projeto
        System.out.println(projeto.gerarRelatorio());
    }
}
