package etec;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int idade;
        String opiniao;
        int otimo = 0;
        int ruim = 0;
        int pessimo = 0;
        int somaIdade = 0;
        double media;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite sua idade ");
            idade = sc.nextInt();
            System.out.println("Digite sua opinião em relação ao filme, segundo as seguintes notas: A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo. ");
            opiniao = sc.next();

            if (opiniao.equals("A"))
                otimo++;
            else if (opiniao.equals("D")) {
                somaIdade += idade;
                ruim++;
            }
            else if (opiniao.equals("E"))
                pessimo++;
        }
        
        media = somaIdade /ruim;
        System.out.println("Quantidade de respostas ÓTIMO foi igual a " + otimo);
        if (ruim > 0)
            System.out.println("Média de idade das pessoas que responderam RUIM foi igual a " + (media));
        else
            System.out.println("Nenhuma pessoa respondeu RUIM.");
        
        System.out.println("Porcentagem das respostas PÉSSIMO foi igual a " + (pessimo * 10) + "%");
    }
}
