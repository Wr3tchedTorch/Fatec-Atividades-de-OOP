import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira dois números inteiros consecutivamente");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();

        System.out.printf("O maior número é %d", getMax(num1, num2));
    }

    private static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }
}