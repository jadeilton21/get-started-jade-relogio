import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaiorValor {



    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("=== O MAIOR DO VALOR ===");
        System.out.println("Digite um numero: ");


        while (true){
            int num = scanner.nextInt();
            if(num == 0) break;
            numeros.add(num);
        }


        if(!numeros.isEmpty()){
            int maior = Collections.max(numeros);

            System.out.println("Maior valor: " + maior);
        }else {

            System.out.println("NENHUM NÚMERO FOI COLOCADO ALÉM DO 0");
        }
    }
}
