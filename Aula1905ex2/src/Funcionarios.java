public class Funcionarios {
    String nome;
    double salario; 

    public void receberAumento(double valorAdicional){
        this.salario = this.salario + valorAdicional;
    }
}