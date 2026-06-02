public class App {
    public static void main(String[] args) throws Exception {
        
        Assinatura normal = new Assinatura(29.99);
        System.out.println("Assinatura inicial: " + normal.exibirBeneficios());

        AssinaturaPremium premium = new AssinaturaPremium(69.99);
        System.out.println("Assinatura Premium: " + premium.exibirBeneficios());
    }
}
