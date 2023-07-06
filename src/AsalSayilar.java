public class AsalSayilar {
    public static void main(String[] args) {

          for (int i=2;i<=100;i++){
              int n=0;
              for (int j=2;j<=i/2;j++){
                  if (i%j==0){
                      n++;
                      break;
                  }
              }
              if (n==0){
                  System.out.print(i+" ");
              }
          }
    }
}
