public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
