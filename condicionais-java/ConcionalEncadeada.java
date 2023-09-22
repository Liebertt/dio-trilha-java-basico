public class CondicionalEncadeada
{
  public static void main (String[]args)
  {
    /* code */
    int nota = 8;

    if (nota >= 7)
        System.out.println ("Aprovado");

    else if (nota >= 5 && nota < 7)
        System.out.println ("Prova de recuperaC'C#o");

    else
        System.out.println ("Reprovado");
  }
}
