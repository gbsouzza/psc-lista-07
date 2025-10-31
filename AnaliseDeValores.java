import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaliseDeValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> valores = new ArrayList<>();
        
        double soma = 0.0;
        int countAcimaMedia = 0;
        int countAbaixoDeSete = 0;

        System.out.println("Digite quantos valores desejar (digite -1 para parar):");

        while (true) {
            double valorLido = scanner.nextDouble();
            
            if (valorLido == -1) {
                break; 
            }
            
            valores.add(valorLido);
            soma += valorLido;
        }

        System.out.println("\n--- Resultados ---");

        System.out.println("Quantidade de valores lidos: " + valores.size());

        System.out.print("Valores na ordem informada: ");
        for (double valor : valores) {
            System.out.print(valor + " | ");
        }
        System.out.println(); 

        System.out.println("Valores na ordem inversa:");
        for (int i = valores.size() - 1; i >= 0; i--) {
            System.out.println(valores.get(i));
        }

        System.out.println("Soma dos valores: " + soma);

        double media = 0.0;
        if (valores.size() > 0) { 
            media = soma / valores.size();
        }
        System.out.printf("Média dos valores: %.2f\n", media);

        for (double valor : valores) {
            if (valor > media) {
                countAcimaMedia++;
            }
            if (valor < 7) {
                countAbaixoDeSete++;
            }
        }
        
        System.out.println("Valores acima da média: " + countAcimaMedia);
        System.out.println("Valores abaixo de sete: " + countAbaixoDeSete);

        System.out.println("\nPrograma encerrado.");
        
        scanner.close();
    }
}