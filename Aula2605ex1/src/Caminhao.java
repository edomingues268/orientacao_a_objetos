public class Caminhao extends Veiculo {

    protected double capacidadeCarga;

    public Caminhao(String placa, int ano, double capacidadeCarga) {
        super(placa, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

}