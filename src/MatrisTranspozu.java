import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=2,k=3;
        int[][] A=new int[n][k];
        int[][] AT=new int[k][n];

        System.out.println("Matris: ");
        for (int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                A[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(i==j){
                    AT[i][j]=A[i][j];
                }
                else{
                    AT[j][i]=A[i][j];
                }
            }
        }

        System.out.println("Transpoze: ");
        for (int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                System.out.print(AT[i][j]);
            }
            System.out.println();
        }
    }
}
