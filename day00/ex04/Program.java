import java.util.Scanner;

public class Program {
    static void print_width(int i, int j) {
        while (j > 0) {
            System.out.println();
            while (i != 0) {
                System.out.print("# ");
                i--;
            }
            j--;
            if (j > 0)
                System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char[] buf = text.toCharArray();
        int[] temp = new int[65536];
        int[][] result = new int[1000][1000];
        int count = 0;
        char[] itog = new char[10];
        int[] nbr = new int[10];
        for (int i = 0; i < text.length(); i++) {
            temp[(int) buf[i]]++;
        }
        for (int i = 0; i < 65536; i++) {
            if (temp[i] != 0) {
                int j = 0;
                while (result[temp[i]][j] != 0)
                    j++;
                result[temp[i]][j] = i;
            }
        }
        for (int i = 999; i >= 0 && count < 10; i--) {
            int j = 0;
            if (result[i][j] != 0) {
                while (result[i][j] != 0) {
                    j++;
                }
                int hh = 0;
                while (hh != j) {
                    if (count == 10)
                        break;
                    itog[count] = (char) result[i][hh];
                    nbr[count] = i;
                    count++;
                    hh++;
                }
            }
        }

        double opredil = (double) (nbr[0]) / 10;
        int level = 0;
        int flag = 0;
        for (int i = 0, j = 9; i < 10; i++) {

            if (nbr[i] != 0) {
                level = (int) (nbr[i] / opredil);
                if (level == j) {
                    int tt = i;
                    int kkkk = 0;
                    while (tt != 0 && flag == 0) {
                        System.out.print("# ");
                        kkkk = 1;
                        tt--;
                    }
                    flag = 1;
                    j = level;
                    if (kkkk == 0)
                        System.out.print(" ");
                    System.out.print(nbr[i]);
                } else {
                    if (flag == 1)
                        System.out.println();
                    flag = 0;
                    level = (int) (nbr[i] / opredil);
                    int oo = j - level;
                    while (oo > 0) {
                        int tt = i;
                        while (tt != 0 && flag == 0) {
                            System.out.print("# ");
                            tt--;
                        }
                        oo--;
                        if (oo != 0)
                            System.out.println();
                    }
                    System.out.print(nbr[i]);
                    flag = 1;
                    j = level;
                }
            }

        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (nbr[i] != 0) {
                System.out.print((char) itog[i] + " ");
            }
        }

    }
}