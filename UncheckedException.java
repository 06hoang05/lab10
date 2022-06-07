package lab06.ex2;

public class UncheckedException{

    public UncheckedException () {
        
    }

    public static void main(String[] args) {
        int i, n  ;

        java.util.Scanner input = new java.util.Scanner(System.in);
        n = input.nextInt();
        System.out.println("Nhap n: " + n);
        int a[] = new int[n];

        for (i = 1; i <= n; i++) {

                try {
                    System.out.printf("a[%d] = ", i);
                    a[i] = input.nextInt();

                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
