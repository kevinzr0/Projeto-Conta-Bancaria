package AtividadeAvaliativa;

public class ContaSalario extends Conta {

    private Cliente cliente;
    private double saldo;

    // Construtor
    public ContaSalario(){}

    public ContaSalario(Cliente cliente){
        this.cliente = cliente;
    }

    // Metodos (com parametros)
    public String consultarSaldo(Cliente cliente, ContaSalario contaSalario){
        return "Nome: "+ cliente.getNome() + " " + "Saldo: " + contaSalario.getSaldo();
    }


    // Metodo na classe filha que substitui o metodo da classe pai
    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
