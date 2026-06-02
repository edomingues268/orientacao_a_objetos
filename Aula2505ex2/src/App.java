public class App {
    public static void main(String[] args) throws Exception {
       Animal a1 = new Animal("Bob", 10);

        a1.dormir(); 
        
        Cachorro a2 = new Cachorro("Thor", 2);

        a2.latir();
        a2.dormir();

        Gato a3 = new Gato("Lilly", 1);

        a3.dormir();
        a3.miar();



    }
}
