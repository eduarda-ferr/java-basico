import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args){
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE", "MARIA"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = salarioPretendido();

            System.out.printf("Candidato(a) %s solicitou o salário de R$ %.2f%n", candidato, salarioPretendido);
            analisarCandidato(salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("Candidato(a) " + candidato + " foi selecionado(a)");
                ligacao(candidato);
            } else {
                System.out.println("Candidato(a) " + candidato + " não foi selecionado(a)");
            }  
            candidatosAtual++;
        }
    }

    static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta.");
        } else {
            System.out.println("Aguardar o resultado dos demais candidatos.");
        }
    }

    static void ligacao(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com " + candidato + " na " + tentativasRealizadas + "ª tentativa de ligação.");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (!atendeu) {
            System.out.println("Não conseguimos contato com " + candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","JULIA","PAULO","AUGUSTO","MONICA"};
    
        System.out.println("Imprimindo lista de candidatos com seu indice: ");
    
        for(int indice = 0; indice < candidatos.length; indice++){
        System.out.println("Candidato de n°"+ (indice+1) + " é "+ candidatos[indice]);
        }
        System.out.println("forma abreviada");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
    } 
}
