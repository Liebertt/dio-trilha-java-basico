package conta-bancaria;

public class Programa {
    public static void main(String[] args) {
        
        Conta c = new Conta();

        c.nome = "João";
        c.cpf = "123456789";
        c.saldo = 200.0;

        System.out.println(c.nome);
        System.out.println(c.cpf);
        System.out.println(c.saldo);
    }
    
}
