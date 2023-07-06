import java.util.Scanner;

public class Fibonacci {
    int fib(int n){
    if(n==0 || n==1){
        return 1;
    }
    int deger = fib(n-1) +fib(n-2);
    System.out.print(deger);
    return deger;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n,n1=0,n2=1,n3;
        System.out.println("Fibonacci serisini girin:");
        n=input.nextInt();
        System.out.print(n1 + " "+ n2);
        for (int i=2;i<=n;i++){
            n3=n2+n1;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }

    }
}
