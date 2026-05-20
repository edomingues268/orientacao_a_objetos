public class ContaBancaria {
    String titular;
   private double saldo;

    public ContaBancaria(String t) {
        this.titular = t;
        this.saldo = 0.0;

    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double v) {
        this.saldo = this.saldo + v;
    }

    public void sacar(double v) {
        if (this.saldo >= v) {
            this.saldo = this.saldo - v;
            System.out.println("Valor sacado da sua conta: " + v);
        } else
            System.out.println("Voce não tem saldo suficiente");
    }
}
