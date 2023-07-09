import java.util.ArrayList;
import java.util.Scanner;

public class DeseneGoreMetot {

     static void azalma(int n,int n_){
        if(n>0){
            System.out.println(n+" ");
            n-=5;
            azalma(n,n_);
        }
        else {
            artma(n,n_);
        }
    }
    static void artma(int n,int n_){
        if(n<=n_){
            System.out.println(n + " ");
            n+=5;
            artma(n,n_);
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int N ,n_;
        System.out.println("N sayısı:");
        N=input.nextInt();
        n_ =N;
        azalma(N,n_);

    }
}
