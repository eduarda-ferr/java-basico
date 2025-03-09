public class PrimeiroProjeto {
    public static void main(String[] args){

        //concatenação
    
        String primeiroNome = "Maria";
        String segundoNome = "Eduarda";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome , String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}

