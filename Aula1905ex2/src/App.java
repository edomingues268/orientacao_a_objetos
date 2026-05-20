public class App {
    public static void main(String[] args) throws Exception {
        Funcionarios funcionario1 = new Funcionarios();

        funcionario1.nome = "Ana";
        funcionario1.salario = 2000.0;
        System.out.println("Salario Ana: " + funcionario1.salario);
        funcionario1.receberAumento(500);
        System.out.println("Salario Ana: " + funcionario1.salario);



        Funcionarios funcionario2 = new Funcionarios();

        funcionario2.nome = "Carlos";
        funcionario2.salario = 1500.0;
        System.out.println("Salario Carlos: " + funcionario2.salario);
        funcionario2.receberAumento(600);
        System.out.println("Salario Carlos: " + funcionario2.salario);
    }
}
