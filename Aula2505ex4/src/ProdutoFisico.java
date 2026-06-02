public class ProdutoFisico extends Produto {
    
    public ProdutoFisico(String nome, double precobase) {
        super(nome, precobase);
    }

    @Override
    public double calcularPrecoFinal() {
        double imposto = precoBase * 0.1;
        return precoBase + imposto + 50.0;

    }   


}
