package questão1;

public class Desenvolvedor extends Empregado {
    private String linguagemProgramacao;

    public void definirLinguagem(String linguagem) {
        this.linguagemProgramacao = linguagem;
    }

    public String obterLinguagem() {
        return linguagemProgramacao;
    }

    public void exibirLinguagem() {
        System.out.println("A sua linguagem de programação é: " + linguagemProgramacao);
    }
}

