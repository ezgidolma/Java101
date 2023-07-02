import java.util.Scanner;

public class ZodyakCalculator {
    public static void main(String[] args) {
        int yil,kalan;
        String burc;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz");
        yil=input.nextInt();

        kalan=yil%12;

        if(kalan==0){
            burc="Maymun";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
       else if(kalan==1){
            burc="Horoz";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==2){
            burc="Köpek";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==3){
            burc="Domuz";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==4){
            burc="Fare";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==5){
            burc="Öküz";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }

        else if(kalan==6){
            burc="Kaplan";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==7){
            burc="Tavşan";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==8){
            burc="Ejderha";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==9){
            burc="Yılan";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==10){
            burc="At";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }
        else if(kalan==11){
            burc="Koyun";
            System.out.println("Çin Zodyağı Burcunuz : "+burc);
        }




    }
}
