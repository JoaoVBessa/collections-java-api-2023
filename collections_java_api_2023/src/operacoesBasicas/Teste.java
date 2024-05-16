package operacoesBasicas;

public class Teste {

	public static void main(String[] args) {
		
		ListaTarefa listaTarefa = new ListaTarefa();
		
		// Adicionando
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		
		// Obtendo quantidade
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
		
		// Removendo
		listaTarefa.removerTarefa("Tarefa 2");
		
		// Obtendo Descrição
		listaTarefa.obterDescricoesTarefas();
	}
	
}
