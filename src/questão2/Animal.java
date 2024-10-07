package questão2;

public class Animal {
    private String apelido;
    private String tipo;

    public Animal(String apelido, String tipo) {
        this.apelido = apelido;
        this.tipo = tipo;
    }

    public String obterApelido() {
        return apelido;
    }

    public String obterTipo() {
        return tipo;
    }

    public String emitirSom() {
        return "Som indefinido";
    }
}
