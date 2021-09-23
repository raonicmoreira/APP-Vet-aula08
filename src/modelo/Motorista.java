package modelo;

public class Motorista extends Pessoa{

    private int matricula;
    private String habilitacao;


    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getHabilitacao() {
        return habilitacao;
    }
    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    @Override
    public String cumprimentar() {
        return "Olá, Passageiro";
    }

    @Override
    public String cumprimentar(Pessoa qualquerPessoa){
        String original = super.cumprimentar(qualquerPessoa);
        String complemento = " Meu nome é %s e serei o seu motorista nesta viagem.";
        return String.format(original + complemento, getNome());
    }
}
