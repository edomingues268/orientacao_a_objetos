public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String t) {
        this.titular = t;
        this.saldo = 0.0;

    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valorDepositado) {
        this.saldo = this.saldo + valorDepositado;
        System.out.println("Deposito Realizado!");
    }

    public void sacar(double valorSacado) {
        if (this.saldo >= valorSacado) {
            this.saldo = this.saldo - valorSacado;
            System.out.println("Valor sacado da sua conta: " + valorSacado);
        } else
            System.out.println("Saldo insuficiente");
    }
}
