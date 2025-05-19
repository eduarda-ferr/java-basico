package Bebida;

public class BebidaFactory {
    public static Bebida criarBebida(String tipo) {
        if (tipo == null) return null;
        switch (tipo.toLowerCase()) {
            case "cafe":
                return new Cafe();
            case "cha":
                return new Cha();
            default:
                return null;
        }
    }
}