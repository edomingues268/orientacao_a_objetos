public class App {
    public static void main(String[] args) throws Exception {
       Produto produto1 = new Produto(); 

        produto1.nome = "Notebook";
        produto1.preco = 1750.0;
        produto1.quantidadeEstoque = 25;
        System.out.println(produto1.nome);
        System.out.println(produto1.preco * produto1.quantidadeEstoque);

        Produto produto2 = new Produto();

        produto2.nome = "Mouse";
        produto2.preco = 500.0;
        produto2.quantidadeEstoque = 50;
        System.out.println(produto2.nome);
        System.out.println(produto2.preco * produto2.quantidadeEstoque);
        
        produto1.adicionarEstoque(15);
        System.out.println("Quantidade Estoque Produto 1: " + produto1.quantidadeEstoque);

        produto1.adicionarEstoque(50);
        System.out.println("Quantidade Estoque Produto 1: " + produto1.quantidadeEstoque);

        produto2.adicionarEstoque(60);
        System.out.println("Quantidade Estoque Produto 2: " + produto2.quantidadeEstoque);

        produto2.adicionarEstoque(90);
        System.out.println("Quantidade Estoque Produto 2: " + produto2.quantidadeEstoque);
    }
}
