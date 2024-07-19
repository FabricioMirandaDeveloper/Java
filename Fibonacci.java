public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        System.out.println("Serie de Fibonacci (primeros " + n + " términos):");;
        int i = 0;
        while (i < n) {
            if(i == 0) {
                System.out.print(a + " ");
            } else if (i == 1) {
                System.out.print(b + " ");
            } else {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            i++;
        }
    }
}
