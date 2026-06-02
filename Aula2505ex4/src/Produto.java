public class Produto {
    protected String nome;
    protected double precoBase;


    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal() {
        double imposto = precoBase * 0.10;
        return precoBase + imposto; 
    }

    
}
