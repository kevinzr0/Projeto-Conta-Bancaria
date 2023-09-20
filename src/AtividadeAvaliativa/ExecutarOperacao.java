package AtividadeAvaliativa;

import java.util.Scanner;

public class ExecutarOperacao {
    public static void main(String[] args) {

        // Instanciando a classe e criando um novo objeto
        ContaCorrente contaCorrente = new ContaCorrente(1900.00);
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        // Fazer cadastro Cliente
        System.out.println("Digite o nome do Cliente: ");
        cliente.setNome(scanner.nextLine());
        Conta conta = new Conta(cliente, 123456, 123);
        ContaSalario contaSalario = new ContaSalario(cliente);
        // Fazer cadastro Cliente

        // Usuario Inserir Informacoes
        System.out.println("Inserir saldo da conta salario: ");
        contaSalario.setSaldo(scanner.nextDouble());
        System.out.println("Inserir saldo da conta corrente: ");
        contaCorrente.setSaldo(scanner.nextDouble());
        int opcao;
        int termina = 0;

        while (termina != 4){
            System.out.println("Escolha a funcao desejada: (1) Saldo (2) Depositar (3) Sacar ");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println(contaSalario.consultarSaldo(cliente, contaSalario));
                System.out.println("Para continuar realizando operacoes, digite 0");
                termina = scanner.nextInt();
            }
            else if (opcao == 2){
                System.out.print("Valor a ser depositado: ");
                double valorDeposito = scanner.nextDouble();

                System.out.println("Saldo Anterior: " + contaCorrente.getSaldo());
                contaCorrente.depositar(valorDeposito, contaCorrente.getSaldo(), contaCorrente);
                System.out.println("Saldo Atual: " + contaCorrente.getSaldo());

                System.out.println("Para continuar realizando operacoes, digite 0");
                termina = scanner.nextInt();
            }
            else if (opcao == 3) {
                System.out.print("Valor a ser sacado: ");
                double valorSaque = scanner.nextDouble();

                System.out.println("Saldo Anterior: " + contaCorrente.getSaldo());
                contaCorrente.sacar(valorSaque, contaCorrente.getSaldo(), contaCorrente);
                System.out.println("Saldo Atual: " + contaCorrente.getSaldo());

                System.out.println("Para continuar realizando operacoes, digite 0");
                termina = scanner.nextInt();
            }
            else{
                System.out.println("Digite uma opcao valida!");
            }
        }
    }
}
