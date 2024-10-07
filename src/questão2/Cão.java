package questão2;

public class Cão extends Animal {
    public Cão(String apelido, String tipo) {
        super(apelido, tipo);
    }

    public String emitirLatido() {
        return "Ladra";
    }
}
