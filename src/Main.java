import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double largura = 10.0;
        double comprimento = 30.0;
        double metroQuadrado = 200.0;
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        Locale.setDefault(Locale.US);

        System.out.printf("A largura do Terreno é R$%.2f\n", largura);
        System.out.printf("O comprimento do Terreno é R$%.2f\n", comprimento);
        System.out.printf("O valor do metro quadrado do Terreno é R$%.2f\n", metroQuadrado);
        System.out.printf("A area do terreno é R$%.2f, e o preco do terreno é R$%.2f  ", area, preco);

        scanner.close();


    }
}