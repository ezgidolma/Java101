import java.util.Scanner;

public class DeseneGoreMetot {

    static void desen(int N){

    int n_s=N;
     while (n_s>0){
         n_s-=5;
         System.out.println(n_s+" ");
     }
     while (n_s<=0){
         n_s+=5;
         System.out.println(n_s+" ");
         if (n_s==N){
             break;
         }
     }



    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int N;
        System.out.println("N sayısı:");
        N=input.nextInt();
        desen(N);
    }
}
