package conta-bancaria;

public class Conta {

    public String nome;
    public String cpf;
    public Double saldo;

    public Conta(){

    }

    public Conta(String nome, String cpf, Double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    
}
