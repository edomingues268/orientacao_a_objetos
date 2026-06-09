public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String cliente, String cpf){
        this.nome = cliente;
        this.cpf = cpf;

        

    }

    
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

}
