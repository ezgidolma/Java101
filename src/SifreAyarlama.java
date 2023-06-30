import java.util.Scanner;

public class SifreAyarlama {
    public static void main(String[] args) {

        String k_adi,sifre,secim,yenisifre;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adı girin:");
        k_adi=input.nextLine();

        System.out.println("Şifre girin:");
        sifre=input.nextLine();

        if (k_adi.equals("ezgi_dlm") && sifre.equals("1234")){
            System.out.println("Giriş yaptınız !");
        }
        else {
            System.out.println("Şifreniz yanlış değiştirmek ister misniz ? (E / H)?");
            secim=input.nextLine();
            switch (secim){
                case "E":
                System.out.println("Yeni sifreyi girin:");
                yenisifre=input.nextLine();
                if (yenisifre.equals(sifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );

                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
                break;
                case "H":
                    System.out.println("Tekrar deneyiniz");
            }
        }

    }
}
