public class Cliente {
    private String nome;
    private String cpf;
    private String cnpj;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String cnpj) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }
    // serve para pegar o nome
    public String getNome() {
        return nome;
    }
    //serve para informar ou setar um nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
