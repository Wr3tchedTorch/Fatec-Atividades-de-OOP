import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número e direi se ele é positivo ou não");
        
        double num = input.nextDouble();
        input.close();

        if (isPositive(num)) {
            System.out.println("O número inserido é positivo");
            return;
        }

        System.out.println("O número inserido é negativo");
    }

    private static boolean isPositive(double num) {
        return num > 0;
    }
}