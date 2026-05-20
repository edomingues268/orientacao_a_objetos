public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("aqui é a main.");

        Cliente cliente1 = new Cliente();

        cliente1.nome = "Eduardo";
        cliente1.idade = 25;
        cliente1.cpf = "12345678910";
        cliente1.saldoEmLoja = 100.0;

        Cliente cliente2 = new Cliente();

        cliente2.nome = "Mauricio";
        cliente2.idade = 23;
        cliente2.cpf = "12345678910";
        cliente2.saldoEmLoja = 200.0;

        System.out.println(cliente2.nome);

    }
}
