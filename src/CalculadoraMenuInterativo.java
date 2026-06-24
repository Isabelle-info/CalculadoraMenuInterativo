import java.util.Scanner;

public class CalculadoraMenuInterativo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;
        double num1, num2, resultado;

        do {
            System.out.println("\n=== CALCULADORA COMPLETA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();

                    resultado = num1 + num2;

                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();

                    resultado = num1 - num2;

                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();

                    resultado = num1 * num2;

                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();

                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    }
                    break;

                case 5:
                    System.out.print("Digite a base: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Digite o expoente: ");
                    num2 = entrada.nextDouble();

                    resultado = Math.pow(num1, num2);

                    System.out.println("Resultado: " + resultado);
                    break;

                case 6:
                    System.out.print("Digite um número: ");
                    num1 = entrada.nextDouble();

                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Não existe raiz quadrada real de número negativo.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando a calculadora...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        entrada.close();
    }
}
