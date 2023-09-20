package AtividadeAvaliativa;

public class ContaCorrente extends Conta {
    private double saldo;

    // Construtor
    public ContaCorrente(double saldoInicial){
        this.saldo = saldoInicial;
    }

    // Metodos (com parametros)
    public void depositar(double deposito, double saldo, ContaCorrente contaCorrente) {
        double saldoAtual = deposito + saldo;
        contaCorrente.setSaldo(saldoAtual);
    }

    public void sacar(double saque, double saldo, ContaCorrente contaCorrente) {
        if(saque > saldo){
            System.out.println("Este valor nao esta disponivel para saque!");
        }
        else{
            double saldoAtual = saldo - saque;
            contaCorrente.setSaldo(saldoAtual);
        }
    }

    // GETTERS E SETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
