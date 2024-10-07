package questão1;

public class Supervisor extends Empregado {
    private String nomeDoProjeto;

    public void definirProjeto(String projeto) {
        this.nomeDoProjeto = projeto;
    }

    public String obterProjeto() {
        return nomeDoProjeto;
    }

    public void exibirProjeto() {
        System.out.println("O projeto atual é: " + nomeDoProjeto);
    }
}

