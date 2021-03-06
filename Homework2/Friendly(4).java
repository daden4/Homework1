import java.util.Scanner;

public class Friendly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int last = 0;

        try {
            System.out.println("Enter start point of diapason :");
            first = scanner.nextInt();

            System.out.println("Enter finish of diapason :");
            last = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if (first > last) {
            System.out.println("Incorrect input!");
        } else {
            for (int k = first; k <= last; k++) {
                for (int j = k + 1; j <= last; j++) {
                    if (dividers(k) == j && dividers(j) == k) {
                        System.out.println(k + " " + j);
                    }
                }
            }
        }
    }

    private static int dividers(int x) {
        int sum = 0;
        for (int i = 1; i <= x / 2; i++)
            if (x % i == 0) sum += i;
        return sum;
    }
}
