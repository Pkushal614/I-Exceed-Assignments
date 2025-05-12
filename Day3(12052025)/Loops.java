public class Loops {
    public static void main(String[] args) {
        

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }


        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count: " + j);
            j++;
        }


        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++;
        } while (k <= 5);
    }
}
