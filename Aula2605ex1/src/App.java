public class App {
    public static void main(String[] args) throws Exception {
        Veiculo v1 = new Veiculo("ABC1234", 2020);
        
        Caminhao v2 = new Caminhao("ABC1234", 2000, 350);

        
        System.out.println("Veiculo :" + v1.ano + v1.placa);


        System.out.println("Caminhao:  " + v2.ano + " "  + v2.placa  + " " +  v2.capacidadeCarga);
    }
}
