public class Palindrom {

    static void isPolindrom(int number){
       int reverse_n=0;
       int fake_number=number;

        while (fake_number!=0){
           int kalan= fake_number%10;
           reverse_n=(reverse_n*10)+kalan;
           fake_number/=10;
        }
        if (reverse_n==number){
            System.out.println("Bu sayı polindromdur");
        }
        else{
            System.out.println("Bu sayı polindrom değildir");
        }

    }
    public static void main(String[] args) {
        isPolindrom(212212);
    }
}
