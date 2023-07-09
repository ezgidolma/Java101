import java.util.Scanner;

public class RecursiveAsal {

    public static boolean asalMi(int number,int i){
    if (number<2){//eğer sayı 2 den küçükse asal olmaz çünkü en küçük asal sayı 2
        return false;
    }

    if(number==2){
        return true;
    }
    if(number%i==0){
        return false;
    }
    if (i*i>number){
        return true;
    }

    return asalMi(number,i+1);

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int number=input.nextInt();
        if(asalMi(number,2)){
            System.out.println(number+ "asal bir sayıdır");
        }
        else {
            System.out.println(number+"asal sayı değildir");
        }

    }
}
