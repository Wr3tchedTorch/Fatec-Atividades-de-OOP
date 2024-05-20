import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número e direi se ele é positivo ou não");

        double num = input.nextDouble();
        input.close();

        if (isPositive(num)) {
            System.out.println("O número inserido é positivo");
        } else if (isZero(num)) {
            System.out.println("O número inserido é igual a 0");
        } else {
            System.out.println("O número inserido é negativo");
        }
    }

    private static boolean isPositive(double num) {
        return num > 0;
    }

    private static boolean isZero(double num) {
        return num == 0;
    }
}