public class ProdutoDigital extends Produto {
    
    public ProdutoDigital(String nome, double precoBase){
        super(nome, precoBase);
    }

    public double calcularPrecoFinal() {
        return this.precoBase;
    }
}
