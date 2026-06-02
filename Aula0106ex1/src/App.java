public class App {
    public static void main(String[] args) throws Exception {
        Vendedor v1 = new Vendedor("Eduardo", 2000.0);

        System.out.println("Salario v1: "  + v1.calcularSalario());

        Gerente g1 = new Gerente("Eduardo", 8000.0);
        System.out.println("Salario g1: " + g1.calcularSalario());
    }
}
