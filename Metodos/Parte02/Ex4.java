import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira dois números inteiros consecutivamente");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();

        System.out.printf("O menor número é %d", getMin(num1, num2));
    }

    private static int getMin(int num1, int num2) {
        return Math.min(num1, num2);
    }
}