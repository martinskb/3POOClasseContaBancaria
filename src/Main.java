/*
3. Classe ContaBancaria (Encapsulamento + Métodos Públicos)
• Crie a classe ContaBancaria com atributos privados:
        ◦ numeroConta (int)
◦ saldo (double)
• Crie um construtor que inicializa o número da conta e saldo inicial.
        • Implemente métodos públicos:
        ◦ depositar(double valor) → soma ao saldo
◦ sacar(double valor) → subtrai do saldo se houver saldo suficiente
◦ getSaldo() → retorna o saldo atual
• No main, crie uma conta e faça depósitos e saques.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria(101, 1000);

        System.out.print("Digite o valor do depósito: ");
        double valor = sc.nextDouble();
        conta1.deposito(valor);

        System.out.print("Digite o valor do saque: ");
        double valor2 = sc.nextDouble();
        conta1.sacar(valor2);

        System.out.println("Saldo atual: " + conta1.getSaldo());
    }
}
