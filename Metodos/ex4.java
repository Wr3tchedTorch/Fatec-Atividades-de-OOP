import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira os valores para 'a', 'b' e 'c' consecutivamente");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        System.out.printf("O valor de delta é %.2f", getDelta(a, b, c));
    }

    private static double getDelta(double a, double b, double c) {
        return b*b - 4*a*c;
    }
}
