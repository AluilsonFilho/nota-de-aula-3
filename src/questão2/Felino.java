package questão2;

public class Felino extends Animal {
    public Felino(String apelido, String tipo) {
        super(apelido, tipo);
    }

    public String emitirMiado() {
        return "Mia";
    }
}
