import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira três números inteiros consecutivamente");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        input.close();

        System.out.printf("O maior número é %d", getMax(num1, num2, num3));
    }

    private static int getMax(int num1, int num2) {
        if (num1 > num2) return num1;
        return num2;
    }

    private static int getMax(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) return num1;
        else if (num2 > num3) return num2;        
        return num3;
    }
}