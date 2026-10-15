import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] vendas = new float[7];
        float total = 0;
        float maior;


        for (int i = 0; i < 7; i++) {
            System.out.print("venda do dia " + (i + 1));
            vendas[i] = sc.nextFloat();
            total += vendas[i];
        }


        maior = vendas[0];
        int diaMaior = 0;

        for (int i = 1; i < 7; i++) {
            if (vendas[i] > maior) {
                maior = vendas[i];
                diaMaior = i;
            }
            float media = total / 7;

            System.out.printf("Total R$ %.2f%n", total);
            System.out.printf("Media diaria R$ %.2f%n", media);


            sc.close();
        }
    }