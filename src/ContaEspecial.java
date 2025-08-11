public class ContaEspecial extends ContaBancaria{
    private double taxaJuros;
    //construtor sem argumentos
    public ContaEspecial() {
    }
    //construtor com todos os argumentos
    public ContaEspecial(int numero, Cliente cliente, double saldo, double limite, double taxaJuros) {
        super(numero, cliente, saldo, limite);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros(){
        super.setSaldo( super.getSaldo() +
                (super.getSaldo() * (taxaJuros/100) ));
    }
}
