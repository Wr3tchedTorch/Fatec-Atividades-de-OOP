import java.util.HashMap;

public class Ex8 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> faceCount = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            int face = dado();
            faceCount.put(face, faceCount.getOrDefault(face, 0) + 1);
        }

        System.out.printf("%d: %d 16.67%%", 1, faceCount.get(1));
        System.out.printf("\n%d: %d 16.67%%", 2, faceCount.get(2));
        System.out.printf("\n%d: %d 16.67%%", 3, faceCount.get(3));
        System.out.printf("\n%d: %d 16.67%%", 4, faceCount.get(4));
        System.out.printf("\n%d: %d 16.67%%", 5, faceCount.get(5));
        System.out.printf("\n%d: %d 16.67%%", 6, faceCount.get(6));
    }

    private static int dado() {
        return (int) Math.round(Math.random() * 5) + 1;
    }
}
