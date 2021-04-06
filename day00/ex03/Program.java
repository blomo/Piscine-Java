public class Program {
    static void printStatistics(long nbr, int i) {
        for (int j = 1; j != i; j++) {
            System.out.print("Week " + j + " ");
            int temp = (int) nbr % 10;
            nbr /= 10;
            while (temp != 0) {
                System.out.print('=');
                temp--;
            }
            System.out.println(">");
        }
    }

    static long rankNbr(int i) {
        long temp = 1;
        for (; i != 0; --i) {
            temp *= 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String weeks = scan.nextLine();
        int i = 1;
        long data = 0;
        while (!weeks.equals("42") && i < 19) {
            String week = "Week " + i;
            if (!weeks.equals(week)) {
                System.out.println("llegalArgument");
                System.exit(-1);
            } else {
                String grades = scan.nextLine();
                Scanner test = new Scanner(grades);
                int min_grade = test.nextInt();
                for (int j = 0; j < 4; j++) {
                    int temp = test.nextInt();
                    if (min_grade > temp) {
                        min_grade = temp;
                    }
                }
                data += rankNbr(i - 1) * min_grade;
            }
            weeks = scan.nextLine();
            i++;
        }
        printStatistics(data, i);
    }
}
