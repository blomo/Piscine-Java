public class Program {
    public static void main(String[] args) {
        int nbr = 479598;
        if (nbr < 0)
            nbr *= -1;
        int i = 10;
        int sum;
        sum = (nbr % i) + (nbr / i % i) + (nbr / (i * i) % i) + (nbr / (i * i * i) % i) + (nbr / (i * i * i * i) % i) + (nbr / (i * i * i * i * i) % i);
        System.out.println(sum);
    }
}