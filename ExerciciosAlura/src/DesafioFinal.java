import java.util.Scanner;

public class DesafioFinal {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    String nomeCliente = "Julia Luciana";
    String tipoConta = "Corrente";
    double saldo = 2500.50;

    System.out.println("------------------------------------------");
    System.out.println("DADOS INICIAIS DO CLIENTE");
    System.out.println("\nNome: " + nomeCliente);
    System.out.println("Tipo de Conta: " + tipoConta);
    System.out.println("Saldo: " + saldo);
    System.out.println("\n------------------------------------------");

    String menu = """
            MENU DE OPERAÇÕES
            \n1. Consultar saldo
            2. Receber valor
            3. Transferir valor
            4. Sair/encerrar
            """;

    int opcao = 0;
    do {
      System.out.println(menu);
      System.out.println("Insira uma das opções de acordo com o Menu de Operações: ");
      opcao = leitura.nextInt();
      System.out.println("------------------------------------------");

      switch (opcao) {
        case 1:
          System.out.println("Saldo atual: " + saldo);
          break;
        case 2:
          System.out.println("Digite o valor a ser recebido: ");
          double vRecebido = leitura.nextFloat();
          saldo += vRecebido;
          break;
        case 3:
          System.out.println("Digite o valor a ser transferido: ");
          double vTransferido = leitura.nextFloat();
          if (vTransferido > saldo) {
            System.out.println("Transação não autorizada! Valor de transferência maior do que o saldo disponível.");
          }
          else {
            saldo -= vTransferido;
            System.out.println("Transferência realizada com sucesso!");
          }
        default:
          System.out.println("ERRO: OPÇÃO NÃO RECONHECIDA.");
      }
      System.out.println("------------------------------------------");
    } while (opcao !=4);
    System.out.println("Transação encerrada. Obrigada por usar nossos serviços!");

  }

}
