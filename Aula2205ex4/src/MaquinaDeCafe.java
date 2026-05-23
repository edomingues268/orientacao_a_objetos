public class MaquinaDeCafe {
    int capsulasDisponiveis;

    public MaquinaDeCafe() {
        this.capsulasDisponiveis = 0;
    }

    public void recarregar(int quantidade) {
        this.capsulasDisponiveis = this.capsulasDisponiveis + quantidade;
    }

    public void fazerCafe() {
        if (this.capsulasDisponiveis > 0) {
            this.capsulasDisponiveis--;
            System.out.println("Café pronto!");
        } else {
            System.out.println("Erro Máquina vazia. Recarregue");
        }

    }

}
