// TaskForge v0 - projeto do curso "Do Código ao Contrato"
// Aula 01.1: Java, a JVM e as primeiras variáveis.
//
// Este é o ponto de partida. Durante a aula você constrói este código,
// e no desafio você evolui ele (veja COMO-ENTREGAR.md).
//
// Como rodar:
//   - No IntelliJ: abra este arquivo e clique em Run.
//   - No terminal: java TaskForge.java

void main() {
// TaskForge v0 - Do Código ao Contrato
// Código final da aula 1.2: entrada validada, status e cartão da tarefa.

    void main() {
        IO.println("=== TaskForge v0 ===");

        String nome = IO.readln("Nome da tarefa: ");
        String descricao = IO.readln("Descrição: ");

        int prioridade = 0;
        do {
            prioridade = Integer.parseInt(IO.readln("Prioridade (1 a 5): "));
            if (prioridade < 1 || prioridade > 5) {
                IO.println("Prioridade inválida.");
            }
        } while (prioridade < 1 || prioridade > 5);

        IO.println();
        String responsavel = IO.readln("Responsável: ");
        double horasEstimadas = Double.parseDouble(IO.readln("Horas estimadas: "));

        int status;
        do {
            IO.println("Escolha uma opção: ");
            IO.println("1 - Pendente");
            IO.println("2 - Em Andamento");
            IO.println("3 - Concluída");
            IO.println("4 - Cancelada");
            status = Integer.parseInt(IO.readln());
            if (status < 1 || status > 4) {
                IO.println("Status inválido.");
            }
        } while (status < 1 || status > 4);

        IO.println("");
        IO.println("------ TAREFA CRIADA ------");
        IO.println("Tarefa:     " + nome);
        IO.println("Descrição:  " + descricao);
        IO.print("Prioridade: ");
        for (int aux = 0; aux < prioridade; aux++) {
            IO.print("*");
        }
        IO.println();

        String statusNome = "";
        switch (status) {
            case 1 -> statusNome = "Pendente";
            case 2 -> statusNome = "Em Andamento";
            case 3 -> statusNome = "Concluída";
            case 4 -> statusNome = "Cancelada";
            default -> statusNome = "Status Inválido";
        }

        IO.println("Status:    " + statusNome);
        IO.println("---------------------------");}
