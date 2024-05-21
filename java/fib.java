import java.util.Scanner;

public class fib{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();

        if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            System.out.println(0);
                System.out.println(1);
            for(int i = 2; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
                
                System.out.println(c);
            }
            
        }
        sc.close();
    }  
     
}

