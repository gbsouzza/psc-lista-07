import java.util.Scanner;

public class InvestigacaoCriminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorSim = 0;
        String resposta;

        System.out.println("Responda 'sim' ou 'nao' para as seguintes perguntas:");

        System.out.print("Telefonou para a vítima? ");
        resposta = scanner.next();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorSim++;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorSim++;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorSim++;
        }

        System.out.print("Devia para a vítima? ");
        resposta = scanner.next();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorSim++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorSim++;
        }

        System.out.println("\n--- Classificação ---");
        
        if (contadorSim == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (contadorSim == 3 || contadorSim == 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (contadorSim == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }
        
        scanner.close();
    }
}