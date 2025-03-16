public class Dados {
    public static void main(String[] args){
        
        byte idade = 30;
        short ano = 2026;
        int cep = 839927448;
        long cpf = 634671890L;
        double salario = 1255.99;
        float pi = 3.14F;
        char idd = 'm';
        //unicode
        String nome = "Mario";
        // String armazena palavras ou frases
        boolean verdadeiro = false;
        //armazena true ou false

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Valor de Pi: " + pi);
        System.out.println("Valor booleano: " + verdadeiro);
        System.out.println("Letra: " + idd);

        // inteiros:
        // byte(-128 a 127)
        // short(-32.768 - 32.767)
        // int(-2.147.483.648 - 2.147.483.647)
        // long(-9.223.372.036.854.775.808 - 9.223.372.036.854.775.807) 
        // (necessário 'L')
        // decimais:
        // float  (±3.4 * 10^38, 7 casas decimais) (necessário 'F')
        // double (±1.8 * 10^308, 15 casas decimais)
    }
}