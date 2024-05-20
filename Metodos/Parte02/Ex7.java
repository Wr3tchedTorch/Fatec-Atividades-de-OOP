import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\nJogar o dado [s/n]: ");
            char repeat = input.next().charAt(0);
            
            if (repeat == 'n') break;
            System.out.printf("Saiu: %d", dado());
        }
        input.close();
    }

    private static int dado() {
        return (int) Math.round(Math.random() * 5 + 1);
    }
}
