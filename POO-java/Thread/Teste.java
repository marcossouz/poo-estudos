
public class Teste {
	public static void main(String[] args) {
		TarefaExibeMensagens tarefa1 = new TarefaExibeMensagens("K19");
		TarefaExibeMensagens tarefa2 = new TarefaExibeMensagens("Java");
		TarefaExibeMensagens tarefa3 = new TarefaExibeMensagens("web");
	
		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);
		Thread thread3 = new Thread(tarefa3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
