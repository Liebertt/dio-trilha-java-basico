package validacaodeprocessos;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
    }


    static void selecaoCandidatos(){
    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    int candidatosSelecioandos = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while ( candidatosSelecioandos < 5){
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato+" Solicitou este valor "+ salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            candidatosSelecioandos++;
        }
    }
}

static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
