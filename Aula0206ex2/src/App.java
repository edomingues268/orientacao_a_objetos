public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno [] alunos = new Aluno[4];

        alunos[0] = new Aluno("Eduardo", 10.0, 9.0);

        alunos[1] = new Aluno("Kalebe", 10.0, 9.0);

        alunos[2] = new Aluno("Pedro", 7.0, 8.0);

        alunos[3] = new Aluno("Marcelo", 10.0, 10.0);

        double somaNotas  = 0;

        for(Aluno aluno : alunos) {
            somaNotas += aluno.getMedia();
        }
        System.out.println("Media Turma " + somaNotas/alunos.length);
    }
}
