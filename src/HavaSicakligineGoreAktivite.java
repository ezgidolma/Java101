import java.util.Scanner;

public class HavaSicakligineGoreAktivite {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Merhaba hava durumuna göre aktivite önermeye hoşgeldiniz.");
        System.out.println("Sıcaklığı girin:");
        int temp=input.nextInt();

        if(temp<5){
            System.out.println("Kayak yapabilirsin.");
        } else if (temp<15 &&temp>5) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (temp>15 && temp<25) {
            System.out.println("Pikniğe gidebilirsin.");
        } else if (temp>25) {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
