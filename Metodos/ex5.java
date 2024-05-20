import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira os valores para 'a', 'b' e 'c' consecutivamente");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        if (a == 0) {
            System.out.println("As raizes não existem, 'a' é igual a 0");
            return;
        }
        
        double[] roots = getRoots(getDelta(a, b, c), a, b);
        if (roots.length == 0) {
            System.out.println("As raizes são complexas e da forma");
            return;
        }
        System.out.printf("As raizes são: %.2f e %.2f", roots[0], roots[1]);
    }

    private static double getDelta(double a, double b, double c) {
        return b*b - 4*a*c;
    }

    private static double[] getRoots(double delta, double a, double b) {
        if (delta < 0) {
            return new double[0];
        }

        double[] roots = new double[2];
        
        double deltaSqrt = Math.sqrt(delta);        
        roots[0] = (-b + deltaSqrt)/2*a;
        roots[1] = (-b - deltaSqrt)/2*a;

        return roots;
    }
}
