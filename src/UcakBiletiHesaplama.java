import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yolculuktipi, n_tutar, i_tutar, t_tutar, y_indirimi, gd_indirimi;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz:");
        mesafe = input.nextInt();

        System.out.println("Yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculuktipi = input.nextInt();

        if(yas>0 && mesafe>0) {
            switch (yolculuktipi) {
                case 1:
                    n_tutar = (int) ((int) mesafe * 0.10);

                    if (yas < 12) {
                        y_indirimi = (int) ((int) n_tutar * 0.5);
                        n_tutar = n_tutar - y_indirimi;
                        System.out.println("Toplam tutar:" + n_tutar);

                    } else if (yas >= 12 && yas <= 24) {
                        y_indirimi = (int) ((int) n_tutar * 0.1);
                        n_tutar = n_tutar - y_indirimi;
                        System.out.println("Toplam tutar:" + n_tutar);
                    } else if (yas>24 && yas<65) {
                        System.out.println("Toplam tutar:" + n_tutar);
                    } else if (yas >= 65) {
                        y_indirimi = (int) ((int) n_tutar * 0.3);
                        n_tutar = n_tutar - y_indirimi;
                        System.out.println("Toplam tutar:" + n_tutar);
                    }
                    break;

                case 2:
                    n_tutar = (int) ((int) mesafe * 0.10);


                    if (yas < 12) {
                        y_indirimi = (int) ((int) n_tutar * 0.5);
                        i_tutar = n_tutar - y_indirimi;
                        gd_indirimi = (int) ((int) i_tutar * 0.2);
                        t_tutar = (i_tutar - gd_indirimi) * 2;
                        System.out.println("Toplam tutar:" + t_tutar);

                    } else if (yas >= 12 && yas <= 24) {
                        y_indirimi = (int) ((int) n_tutar * 0.1);
                        i_tutar = n_tutar - y_indirimi;
                        gd_indirimi = (int) ((int) i_tutar * 0.2);
                        t_tutar = (i_tutar - gd_indirimi) * 2;
                        System.out.println("Toplam tutar:" + t_tutar);
                    } else if (yas>24 && yas<65) {
                        System.out.println("Toplam tutar:" + n_tutar*2);
                    }else if (yas >= 65) {
                        y_indirimi = (int) ((int) n_tutar * 0.3);
                        i_tutar = n_tutar - y_indirimi;
                        gd_indirimi = (int) ((int) i_tutar * 0.2);
                        t_tutar = (i_tutar - gd_indirimi) * 2;
                        System.out.println("Toplam tutar:" + t_tutar);
                    }
                    break;
                default:
                    System.out.println("Hatalı veri girdiniz !");
                    break;
            }
        }
        else {
            System.out.println("Hatalı veri girdiniz !");
        }

    }
}
