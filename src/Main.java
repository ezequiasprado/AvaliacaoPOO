//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome;
        //método construtor sme argumentos
        Cliente cliente1 = new Cliente();
        // cliente1.nome = "Filipe";
        //usando private é assim através do setNome()
        cliente1.setNome("Filipe");
        cliente1.setCpf("045467589-97");
        cliente1.setCnpj("");
        Cliente cliente2 =
                new Cliente("Diego Pinto", "9328493","");
        Cliente cliente3 =
                new Cliente("Cassiano Pinto junior", "9328494","");
        ContaEspecial contaEspecial1 =
                new ContaEspecial(1,cliente1,100,1000,5);
        ContaEspecial contaEspecial2 =
                new ContaEspecial(2,cliente2,110,1100,5);
        ContaEspecial contaEspecial3 =
                new ContaEspecial(3,cliente3,120,1200,5);
    }
}