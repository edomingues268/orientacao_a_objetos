public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    public Carro(String m, String mc, int ano, String cor) {
        this.modelo = m;
        this.marca = mc;
        this.ano = ano;
        this.cor = cor;

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelonovo){
        this.modelo = modelonovo;
    }



    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marcanova){
        this.marca = marcanova;
    }



    public int getAno(){
        return this.ano;
    }

    public void setInt(int anonovo){
        this.ano = anonovo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String corNova){
        this.cor = corNova;
    }
}
