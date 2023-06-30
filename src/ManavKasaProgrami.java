import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Meyveler ve KG Fiyatları\n" +
                "\n" +
                "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL");

        System.out.println("Armut kaç kilo ? : ");
        double armut=input.nextDouble();

        System.out.println("Elma kaç kilo ? : ");
        double elma=input.nextDouble();

        System.out.println("Domates kaç kilo ? : ");
        double domates=input.nextDouble();

        System.out.println("Muz kaç kilo ? : ");
        double muz=input.nextDouble();

        System.out.println("Patlıcan kaç kilo ? : ");
        double patlican=input.nextDouble();

        double toplam= 2.14*armut+3.67*elma+1.11*domates+0.95*muz+5.00*patlican;
        System.out.println("Toplam tutar : "+toplam);


    }
}
