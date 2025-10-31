import java.util.Scanner;

public class MediaTemperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[12];
        String[] meses = {
            "1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril",
            "5 - Maio", "6 - Junho", "7 - Julho", "8 - Agosto",
            "9 - Setembro", "10 - Outubro", "11 - Novembro", "12 - Dezembro"
        };
        
        double soma = 0.0;

        System.out.println("Digite a temperatura média de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double mediaAnual = soma / 12;
        System.out.println("\n----------------------------------------");
        System.out.printf("A média anual de temperatura foi: %.2f°C\n", mediaAnual);
        System.out.println("----------------------------------------");

        System.out.println("Meses com temperatura acima da média:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.printf("%s com %.2f°C\n", meses[i], temperaturas[i]);
            }
        }
        
        scanner.close();
    }
}