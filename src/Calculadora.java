import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um numero quantos numeros quiser: ");
        double num1 = scanner.nextDouble();


        System.out.println("Digite a operação: (+, -, *, /) ");
        char operacao = scanner.next().charAt(0);


        System.out.println("Digite o 2 numero: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;


        switch(operacao){

            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num1 / num2; break;
            default:
                System.out.println("Operação Invalida");
        }


        System.out.println("Resultado: " + resultado);

        scanner.close();


    }
}
