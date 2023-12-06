import java.util.*;

class Sol3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(f(a));
    }
    public static int f(int a)
    {
        int n = a, factors = 1, count = 0, remainder = 0;
        while (n > 0) {
            int temp = factors;
            if (n % 10 == 0) {
                remainder = 0;
            }
            else if (n % 10 > 1) {
                remainder = temp;
            }
            else if (n % 10 == 1) {
                remainder = (a % temp) + 1;
            }
            factors*= 10;
            count += (a / factors) * temp + remainder;
            n = n / 10;
        }
        return count;
    }
}
