public class TabelaVerdade {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("condições verdadeiras.");
        }
        if (condicao1 || condicao2) {
            System.out.println("umas das condições é verdadeira.");        
        }
        System.out.println("fim.");

    }
}