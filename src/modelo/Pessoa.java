package modelo;

public abstract class Pessoa {

    private String nome;
    private String cpf;

    public abstract String cumprimentar();

    public String cumprimentar(Pessoa qualquerPessoa){
        return String.format("Olá, %s", qualquerPessoa.getNome());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
