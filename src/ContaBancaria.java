import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private Cliente cliente;// nome,cpf.cnpj
    private double saldo;
    private double limite;

    //método depositar
    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depósito feito com sucesso!");
        System.out.println("Saldo atual: R$"+saldo);
    }
    //método sacar
    // saldo = 100;   limite= 1000;
    public void sacar(double valor){
        exibirSaldo();
        System.out.println("Limite atual:"+limite);
        if ( valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque feito com sucesso!");
        }else if (valor <= (saldo + limite)) {
            System.out.println("Você utilizará o seu limite!");
            System.out.println("Digite 1 para confirmar ou 2 para SAIR.");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            if (opcao == 1){
                // (100 + 1000) - 500
                limite = (saldo + limite) - valor ; //600
                saldo = 0;
            }
        }
        exibirSaldo();

    }
    //método exibir saldo
    public void exibirSaldo(){
        System.out.println("Saldo Atual R$"+saldo);
    }

    //construtor sem argumentos
    // ContaBancaria conta1 = new ContaBancaria();
    public ContaBancaria() {
    }
    //construtor com todos atributos
    //ContaBancaria conta2 = new ContaBancaria(121,clinte1, 100, 1000);
    public ContaBancaria(int numero, Cliente cliente, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
