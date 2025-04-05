import java.util.ArrayList;
import java.util.Scanner;

public class MediaAluno {




    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        ArrayList<Double> notas = new ArrayList<>();
        System.out.println("Digite  Média do aluno: ");
        while (true) {
            double nota = scanner.nextDouble();
            if (nota <= 0) break;
            notas.add(nota);
        }


        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }


        double media = soma / notas.size();
        System.out.println("Media: " + media);
        System.out.println(media >= 7.6? "Aprovado":"Reprovado");
    }
}
