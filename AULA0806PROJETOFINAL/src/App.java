import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Quarto[] quartos = new Quarto[5];
        quartos[0] = new QuartoLuxo(210, 150.0);
        quartos[1] = new QuartoSimples(101, 100.0);
        quartos[2] = new QuartoSimples(105, 105.0);
        quartos[3] = new QuartoSimples(305, 150.0);
        quartos[4] = new QuartoLuxo(902, 900.0);

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Eduardo", "111.111.111-11"));
        clientes.add(new Cliente("Madu", "222.222.222-22"));

        ArrayList<Hospedagem> hospedagens = new ArrayList<>();

        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        do {

            System.out.println("Mapa dos Quartos");

            for(Quarto q : quartos) {
                if(q.getIsOcupado()){
                    System.out.println(q.getNumero() + "-[OCUPADO]");

                } else {
                    System.out.println(q.getNumero() + "- [Livre]");
                }
            }

            System.out.println("1 - Cadastrar-Cliente");
            System.out.println("2 - Check-in");
            System.out.println("3 - Check-out");
            System.out.println("4 - Balanço de caixa");
            System.out.println("5 - Sair");

            System.out.println("Digite uma opção");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = teclado.nextLine();

                    System.out.println("Digite o CPF do Cliente: ");
                    String cpf = teclado.nextLine();
                    break;
                case 2:
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNome());
                    }
                    System.out.println("Digite o indice do cliente: ");
                    int cid = teclado.nextInt();

                    System.out.println("Digite o numero do quarto:");

                    int nQuarto = teclado.nextInt();

                    System.out.println("Digite o numero de diarias: ");

                    int nDiarias = teclado.nextInt();

                    for (Quarto q : quartos) {
                        if (!q.getIsOcupado() && q.getNumero() == nQuarto) {
                            q.setIsOcupado(true);
                            hospedagens.add(new Hospedagem(q, clientes.get(cid), nDiarias));
                            System.out.println("Hospedagem criada com sucesso!");
                            break;
                        }
                    }
                    break;

                case 3: 

                    System.out.println("Digite o numero do quarto para checkout");
                    int nOut = teclado.nextInt();

                    for(Hospedagem h : hospedagens) {
                        if (h.getQuarto().getNumero() == nOut && h.getIsAtiva()){

                            double total = h.getQuarto().calcularTotal(h.getDiarias());
                            System.out.println("Total a pagar: R$" + total);
                            h.getQuarto().setIsOcupado(false);
                            h.setIsAtiva(false);
                            h.setValorTotal(total);
                            System.out.println("Checkout realizado");
                            break;
                        }
                    }
                    break;
                case 4: 
                    double totalCaixa = 0.0;
                        for(Hospedagem h : hospedagens){
                            if(!h.getIsAtiva()){
                                totalCaixa += h.getValorTotal();
                            }
                        }
                        System.out.println("Balanço total: R$ " + totalCaixa);
                        break;
                case 5:
                    System.out.println("Fechando o programa...");
                    break;

                default:
                    System.out.println("Operação inválida!");

            }
        } while (opcao != 5);

    }
}
