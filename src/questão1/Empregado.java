package questão1;

public class Empregado {

    protected String nomeCompleto;
    protected int anoNascimento, anosDeIdade, totalHorasTrabalhadas;
    protected double taxaPorHora, pagamentoTotal;

    public int obterHorasTrabalhadas() {
        return totalHorasTrabalhadas;
    }

    public void definirHorasTrabalhadas(int horasTrabalhadas) {
        this.totalHorasTrabalhadas = horasTrabalhadas;
    }

    public double obterTaxaHora() {
        return taxaPorHora;
    }

    public void definirTaxaHora(double taxaHora) {
        this.taxaPorHora = taxaHora;
    }

    public void definirNomeCompleto(String nome) {
        this.nomeCompleto = nome;
    }

    public String obterNomeCompleto() {
        return nomeCompleto;
    }

    public void definirIdade(int idade) {
        this.anosDeIdade = idade;
    }

    public int obterIdade() {
        return anosDeIdade;
    }

    public void definirPagamento(double salario) {
        this.pagamentoTotal = salario;
    }

    public void calcularPagamento() {
        pagamentoTotal = taxaPorHora * totalHorasTrabalhadas;
    }

    public void calcularAnoNascimento() {
        anoNascimento = 2024 - anosDeIdade;
    }
}
