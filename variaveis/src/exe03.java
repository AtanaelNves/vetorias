import java.util.Scanner;
public class exe03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] codigos = {101, 102, 103, 104, 105};
        float[] precos = {10.50, 25.90, 15.00, 40.00, 8.75};

        System.out.println("Mostre o codigo do produto");
        int codigobusca = scanner.nextInt();

        float  encontrado = false;

        for(int i = 0; i < codigos.length; i++)
        {


            if(codigos[i]==codigobusca)
            {
                System.out.println("Preço: R$"+ precos[i]);
                encontrado = true;
                break;
            }
            else if (encontrado!=true)
            {
                System.out.println( "Produto não cadastrado");
            }
        }
        scanner.close();

    }
}