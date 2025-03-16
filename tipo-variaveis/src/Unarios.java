public class Unarios {
    public static void main(String[] args) {
        
    //Converter números positivos para negativos
        int numero1 = 5;
        numero1 = -numero1;
        System.out.println(numero1);

    //Converter números negativos para positivos
        int numero2 = -8;
        numero2 = numero2* -1;
        System.out.println(numero2);

    //incremento ou decremento    
        int numero3 = 0 ;
        numero3 = numero3++; // '--' para decremento
        System.out.println(numero3);
    
    //negação
        boolean verdadeiro = true;
        System.out.println(!verdadeiro);
    }
}