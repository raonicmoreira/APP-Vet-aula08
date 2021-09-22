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
    public String comprimentar() {
        return "Olá, Passageiro";
    }
}
