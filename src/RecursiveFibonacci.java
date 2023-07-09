public class RecursiveFibonacci
{
    static int fib(int n){
        if(n==1 ||n==2){
            return 1;
        }
        else {
            int deger= fib(n-1)+fib(n-2);
            return deger;
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
