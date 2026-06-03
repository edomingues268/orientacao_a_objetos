import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Tarefa> tarefas = new ArrayList<>(); 

        tarefas.add(new Tarefa("Lava louça"));
        tarefas.add(new Tarefa("comer"));
        tarefas.add(new Tarefa("Limpar casa"));
        tarefas.add(new Tarefa("levar cachorro para passear"));

        tarefas.get(1).finalizarTarefa();        
        

        for(Tarefa t : tarefas) {
           
            if (t.getConcluida() == false) {
                System.out.println(t.getDescricao());
            }
        }
    }
}
