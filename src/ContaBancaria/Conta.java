package ContaBancaria;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String mensagens = "Dados iniciais do cliente:";
        String nome = "Gabriel Vinicius Freitas Costa";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        int opcao = 0;

        System.out.println(mensagens);
        System.out.println("******************************");
        System.out.println("\nNome do cliente: %s".formatted(nome));
        System.out.println("Tipo conta: %s".formatted(tipoConta));
        System.out.println("Saldo atual: R$ %.2f\n".formatted(saldo));
        System.out.println("******************************");

        String menu = """
                Digite sua opção:
                1 - Consultar saldo
                2 - Transferir pix
                3 - Receber pix
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atual: R$ %.2f\n".formatted(saldo));
            } else if (opcao == 2){
                System.out.println("Informe o valor a ser transferido:");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Saldo atualizado: R$ %.2f\n".formatted(saldo));
                }
            } else if (opcao == 3){
                System.out.println("Informe o valor que foi recebido:");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo Atualizado: R$ %.2f\n".formatted(saldo));
            } else if (opcao != 4) {
                System.out.println("Opção invalida\n");
            }


        }




    }
}
