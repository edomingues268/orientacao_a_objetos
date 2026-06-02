public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario f1 = new Funcionario("Eduardo", 2000);

        double bonus;

        bonus = f1.calcularBonus();
        System.out.println("Bonus: " + bonus);


        Gerente f2 = new Gerente("Bruno", 5000);

        bonus = f2.calcularBonus();
        System.out.println("Bonus gerente: " + bonus);
        
    }
}
