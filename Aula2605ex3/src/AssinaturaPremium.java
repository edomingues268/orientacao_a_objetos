public class AssinaturaPremium extends Assinatura {
    
    public AssinaturaPremium(double precoBase){
        super(precoBase);
    }


    @Override
    public String exibirBeneficios(){
        return "Filmes em 4k + sem anuncios";
    }
}
