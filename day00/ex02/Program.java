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

    static boolean primeNbr(int nbr) {
        if (nbr == 2)
            return true;
        for (int i = 2; i < squareRoot(nbr); i++) {
            if (nbr % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumNbr(long nbr) {
        if (nbr < 0)
            nbr *= -1;
        int i = 10;
        int sum = 0;
        while (nbr != 0) {
            sum += nbr % i;
            nbr /= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long nbr = scan.nextLong();
        int count = 0;
        while (nbr != 42) {
            if (nbr == 1 || nbr == 0) {
                nbr = scan.nextLong();
                continue;
            }
            int temp = sumNbr(nbr);
            if (primeNbr(temp))
                count++;
            nbr = scan.nextLong();
        }
        System.out.print("Count of coffee-request - ");
        System.out.println(count);
    }
}
