import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleDeSalarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> vendas = new ArrayList<>();
        
        int[] faixasSalarial = new int[9]; 

        System.out.println("Digite o valor das vendas brutas de cada vendedor (digite -1 para parar):");

        while (true) {
            double venda = scanner.nextDouble();
            if (venda < 0) { 
                break;
            }
            vendas.add(venda);
        }

        for (double vendaBruta : vendas) {
            double salario = 200 + (vendaBruta * 0.09);

            if (salario >= 200 && salario <= 299) {
                faixasSalarial[0]++;
            } else if (salario >= 300 && salario <= 399) {
                faixasSalarial[1]++;
            } else if (salario >= 400 && salario <= 499) {
                faixasSalarial[2]++;
            } else if (salario >= 500 && salario <= 599) {
                faixasSalarial[3]++;
            } else if (salario >= 600 && salario <= 699) {
                faixasSalarial[4]++;
            } else if (salario >= 700 && salario <= 799) {
                faixasSalarial[5]++;
            } else if (salario >= 800 && salario <= 899) {
                faixasSalarial[6]++;
            } else if (salario >= 900 && salario <= 999) {
                faixasSalarial[7]++;
            } else if (salario >= 1000) {
                faixasSalarial[8]++;
            }
        }

        System.out.println("\n--- Contagem de Vendedores por Faixa Salarial ---");
        System.out.println("$200 - $299: " + faixasSalarial[0]);
        System.out.println("$300 - $399: " + faixasSalarial[1]);
        System.out.println("$400 - $499: " + faixasSalarial[2]);
        System.out.println("$500 - $599: " + faixasSalarial[3]);
        System.out.println("$600 - $699: " + faixasSalarial[4]);
        System.out.println("$700 - $799: " + faixasSalarial[5]);
        System.out.println("$800 - $899: " + faixasSalarial[6]);
        System.out.println("$900 - $999: " + faixasSalarial[7]);
        System.out.println("$1000 em diante: " + faixasSalarial[8]);

        scanner.close();
    }
}