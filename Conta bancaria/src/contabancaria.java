import java.util.Scanner;

public class contabancaria {
    public static void main(String[] args) {
        String nome = "Gadiel Vargas";
        String tipoConta = "Corrente";
        double saldo = 2999.99;
        int opcao = 0;

        System.out.println("**********************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta " + tipoConta);
        System.out.println("Saldo atual " + saldo);
        System.out.println("\n**********************************************");

        String menu = """
                Digite sua opção
                1- Consultar Saldos
                2- Transferir Valor
                3- Receber Valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O seu saldo atual é de " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor a ser transferido?");
                double transferirValor = leitura.nextDouble();
                if (transferirValor > saldo){
                    System.out.println("Saldo insuficiente para esta transferência!");
                }else {
                    saldo -= transferirValor;
                    System.out.println("Seu saldo atualizado é de: " + saldo);
                }
            }else if (opcao == 3){
                System.out.println("Você recebeu uma transferência ");
                double receberValor = leitura.nextDouble();
                saldo += receberValor;
                System.out.println("Seu saldo atualizado é de: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opção inválida!");
            }
        }
    }
}