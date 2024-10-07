package questão2;

public class ProgamaPrincipal {
    public static void main(String[] args) {
        Cão cão = new Cão("Rex", "Labrador");
        Felino felino = new Felino("Minhoca", "Siamês");

        System.out.println("O cão " + cão.obterApelido() + " da raça " + cão.obterTipo() + " " + cão.emitirLatido());
        System.out.println("O felino " + felino.obterApelido() + " da raça " + felino.obterTipo() + " " + felino.emitirMiado());
    }
}
