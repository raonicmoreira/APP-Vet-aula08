package modelo;

public class Passageiro extends Pessoa{

    private int codigoCliente;



    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String cumprimentar() {
        
        return "Olá Motorista!";
    }
}
