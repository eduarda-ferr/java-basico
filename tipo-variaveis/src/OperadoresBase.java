public class OperadoresBase {
    public static void main(String[] args) {

        //classe operadores java
        double soma = 12.65 + 7;
        System.out.println(soma);
        int subtracao = 115 - 50;
        System.out.println(subtracao);
        int multiplicacao = 3 * 3;
        System.out.println(multiplicacao);
        int divisao = 18 / 2;
        System.out.println(divisao);
        int modulo = 15 % 3;
        System.out.println(modulo);
        double operacao = (10 * 4) + (70 / 2);
        System.out.println(operacao);

        //soma de String e Concatenação
        String palavras = ("CURSO"+"JAVA");
        System.out.println("Resultado: "+ palavras);

        String concatenacao = "?";
        
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}