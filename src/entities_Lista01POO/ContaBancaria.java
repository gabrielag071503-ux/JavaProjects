package entities_Lista01POO;

public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double valorContaCorrente;

    public ContaBancaria(String nomeTitular, int numeroConta, double depositoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        if (depositoInicial >= 0) {
            this.valorContaCorrente = depositoInicial;
        } else {
            this.valorContaCorrente = 0.0;
            System.out.println("Aviso: Saldo inicial não pode ser negativo,Saldo definido como R$ 0,00.");
        }

    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public double getValorContaCorrente() {
        return valorContaCorrente;
    }

    public void emitirSaldo() {
        System.out.println("_____Emitir Saldo para " + nomeTitular + " !");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Numero Conta: " + numeroConta);
        System.out.printf("Saldo atual: R$%.2f%n", valorContaCorrente);
        System.out.println("_____________________________________________");
    }

    public void deposito(double valor) {
        if (valor > 0) {
            valorContaCorrente += valor;
            System.out.printf("Deposito de R$ %.2f%n realizado com suceeso!", valor);

        } else {
            System.out.println("ERRO!O valor do deposito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("ERRO!O valor de saque deve ser maior que zero.");
        } else if (valor > valorContaCorrente) {
            System.out.println("Erro!O valor atual é maior que seu saldo, seu saldo atual é de R$ "
                    + String.format("%.2f", valorContaCorrente));
        } else {
            valorContaCorrente -= valor;
            System.out.printf("Saque de R$ %.2f%n realizado com sucesso!", valor);
            System.out.printf("Seu saldo atual é de R$ %.2f%n", valorContaCorrente);
        }
    }
}
