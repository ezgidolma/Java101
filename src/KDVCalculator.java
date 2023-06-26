import java.util.Scanner;

public class KDVCalculator {
    public  static  void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter normal price: ");
        int normalprice = input.nextInt();

        if(normalprice>0 && normalprice<1000){
            double KdvPrice=1.8;
            double price =normalprice + KdvPrice;
            System.out.println("Normal price: "+normalprice);
            System.out.println("KDV with price: "+price);
            System.out.println("KDV : "+KdvPrice);
        }
        else{
            double KdvPrice=0.08;
            double price =normalprice +KdvPrice;
            System.out.println("Normal price: "+normalprice);
            System.out.println("KDV with price: "+price);
            System.out.println("KDV : "+KdvPrice);
        }

    }


}
