public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta();


        conta1.titular = "Eduardo";
        conta1.saldo = 0;


        conta1.depositar(100.0);

        conta1.sacar(75);

        
    }
}
