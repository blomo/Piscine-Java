import java.util.Scanner;

public class Program {
    static long squareRoot(long nbr) {
        int i = 2;
        int result = 1;
        while (result < nbr) {
            result = i * i;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long nbr = scan.nextLong();
        if (nbr < 2) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
        int count = 0;
        for (int i = 2; i < squareRoot(nbr); i++) {
            count++;
            if (nbr % i == 0) {
                System.out.print("false ");
                System.out.println(count);
                return;
            }
        }
        System.out.print("true ");
        System.out.println(count);
    }
}