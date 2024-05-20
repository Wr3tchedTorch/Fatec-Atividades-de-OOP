import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        
        System.out.print("Insira um número inteiro: ");        
        ArrayList<Integer> nums = new ArrayList<>();        
        nums.add(input.nextInt());
        
        while (true) {            
            System.out.print("Deseja inserir outro número? [s/n]: ");
            char repeat = Character.toLowerCase(input.next().charAt(0));
            if (repeat == 'n') break;

            System.out.print("Insira outro número inteiro: ");
            nums.add(input.nextInt());
        }
        input.close();

        System.out.printf("O menor número é %d", getMin(nums));
    }

    private static int getMin(ArrayList<Integer> nums) {
        nums.sort(Comparator.naturalOrder());
        return nums.get(0);
    }
}