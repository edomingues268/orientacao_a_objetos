public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro("Honda Civic", "Honda", 2000, "Prata");
        carro1.setModelo("Fit");
        System.out.println("Modelo do carro 1: " + carro1.getModelo());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getCor()); 

        Carro carro2 = new Carro("Corolla", "Toyota", 1999, "Vermelho");
        
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getAno());
        System.out.println(carro2.getCor()); 

        Carro carro3 = new Carro("Skyline", "Nissan", 2001, "Azul");
        carro3.setModelo("Ford");
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getMarca());
        System.out.println(carro3.getAno());
        System.out.println(carro3.getCor()); 

    }
}
