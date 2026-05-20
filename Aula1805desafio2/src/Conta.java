public class Conta{

String titular;
double saldo;

public void depositar(double valor) {
    this.saldo = this.saldo + valor;
    System.out.println("Saldo adicionado a sua conta: " + valor); 
    System.out.println("Saldo atual " + this.saldo);
}



public void sacar(double valor) {
    if (this.saldo >= valor) {
        this.saldo = this.saldo - valor;
        System.out.println("Saldo retirado da sua conta: " + valor);
    } else {
        System.out.println("Voce não tem saldo suficiente.");
    };
    System.out.println("Saldo atual " + this.saldo);
}

}