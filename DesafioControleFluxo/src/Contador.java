import java.util.Scanner;
class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String message){
        super(message);
    }
}

public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
        int parametroUm;
        int parametroDois;

        while (true) {
            System.out.println("Digite o primeiro parâmetro:");
		    parametroUm = terminal.nextInt();
		    System.out.println("Digite o segundo parâmetro:");
		    parametroDois = terminal.nextInt();

            if (parametroUm < parametroDois) {
                break;
            }else{
                System.out.println("O segundo parâmetro deve ser maior que o primeiro. Tente novamente.");
            }
        }

		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
        terminal.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");   
        }
	
		int contagem = parametroDois - parametroUm;
        
        for (int i = 1; i <= contagem; i++){
            System.out.println("imprimindo o número... "+ i);
        }
	}
}