public class ContaEstudante extends Conta {
    
    public ContaEstudante(int numero, double saldo){
        super(numero, saldo);
    }
    @Override
    public void cobrarTarifa(){
        System.out.println("Conta estudantil isenta de tarifa.");
    }
}
