package AtividadeAvaliativa;

public class Conta {

    // ATRIBUTOS da classe
    private Cliente cliente;
    private final int agencia = 0001;
    private int numeroConta;
    private int digitoVerificador;

    // Construtor sem parametro - Nao precisa instanciar depois;
    public Conta(){}

    // Construtor com parametros
    public Conta(Cliente cliente, int numeroConta, int digitoVerificador){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.digitoVerificador = digitoVerificador;
    }

    // GETTERS & SETTERS
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getAgencia() {
        return agencia;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }


}
