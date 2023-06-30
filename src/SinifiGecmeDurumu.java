import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Math note: ");
        int math= input.nextInt();

        System.out.println("Please enter Physical note: ");
        int physical= input.nextInt();

        System.out.println("Please enter Turkish note: ");
        int turkish= input.nextInt();

        System.out.println("Please enter Chemistry note: ");
        int chemistry= input.nextInt();

        System.out.println("Please enter Music note: ");
        int music= input.nextInt();

        while ((math>=0 && math<=100) &&(physical>=0 && physical<=100) && (turkish>=0 && turkish<=100)&&(chemistry>=0 && chemistry<=100)&&(music>=0 && music<=100)){
            if ((math+physical+turkish+chemistry+music)/5 >=55){
                System.out.println("Sınıfı geçtiniz tebrikler");
                System.out.println("Ortalamanız"+(math+physical+turkish+chemistry+music)/5 );
                break;
            }
            else {
                System.out.println("Maalesef kaldınız.");
                break;
            }
        }
    }
}
