public class CondicionalTernaria {
    public static void main(String[] args) {
        int nota = 6;

                           //condição  //true        //false
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        System.out.println("##########################################");
        int nota1 = 3;

                           //condição   //true        //-----------------false---------------------------
        String resultado1 = nota1 >= 7 ? "Aprovado" : nota1 >= 5 && nota1 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado1);
        
        System.out.println("##########################################");
        int nota2 = 6;

                           //condição   //true        //-----------------false---------------------------
        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

        System.out.println("##########################################");
        int nota3 = 8;

                           //condição   //true        //-----------------false---------------------------
        String resultado3 = nota3 >= 7 ? "Aprovado" : nota3 >= 5 && nota3 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado3);
    }
}
