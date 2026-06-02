public class Conta {
    protected int numero;
    protected double saldo;

    public Conta (int numero, double saldoInicial){
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void cobrarTarifa(){
        this.saldo -= 15.0;
        System.out.println("Tarifa Cobrada!");
    }

    
}
