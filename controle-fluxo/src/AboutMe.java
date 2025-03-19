import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá, me chamo "+nome.toUpperCase()+" "+ sobrenome.toUpperCase());
        System.out.println("Possuo "+ idade +" anos");
        System.out.println("Minha Altura é de "+ altura +"cm");
        scanner.close();
        }
        
        catch(InputMismatchException e){
            System.out.println("Campo IDADE ou ALTURA precisam ser numéricos, por favor, Preencha os dados novamente.");
        }
    }
}