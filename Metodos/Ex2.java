import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número e direi se ele é igual a 0 ou não");
        
        double num = input.nextDouble();
        input.close();

        if (isZero(num)) {
            System.out.println("O número inserido é igual a zero");
            return;
        }

        System.out.println("O número inserido não é igual a zero");
    }

    private static boolean isZero(double num) {
        return num == 0;
    }
}