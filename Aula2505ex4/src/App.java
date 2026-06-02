public class App {
    public static void main(String[] args) throws Exception {
        
        
        Produto p1 = new Produto("Celular", 1000);
        ProdutoFisico p2 = new ProdutoFisico("TV", 2000);
        ProdutoDigital p3 = new ProdutoDigital("ebook", 30);
        

        p1.calcularPrecoFinal();
        System.out.println("Preço final: " + p1.calcularPrecoFinal());


        System.out.println("Preço final p2: " + p2.calcularPrecoFinal());

        System.out.println("Preço final p3: " + p3.calcularPrecoFinal());
    }



}
