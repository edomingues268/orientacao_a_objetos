public class LampadaRGB implements DispositivoInteligente {
    

    @Override
    public void ligar () {
        System.out.println("Acendendo Luz Branca");
    }
    @Override
    public void desligar () {
        System.out.println("Desligando Luz Branca");
    }
}
