import java.util.Scanner;

public class FrekansHesaplama {

    static  boolean isFind(int[] tekrarlanan ,int value){
        for (int i=0;i< tekrarlanan.length;i++){
            if(tekrarlanan[i]==value){
                return  true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] list={10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrarlanan=new int[list.length];


        for(int i=0;i<list.length;i++){
            int count=1;
            for (int j=+1;j<list.length;j++) {
                if ((list[i] == list[j]) && (i != j)) {
                    count++;
                }
            }
            if( !isFind(tekrarlanan,list[i])){
                tekrarlanan[i]=list[i];
                System.out.println(tekrarlanan[i] + "sayısı "+ count+" kere tekrar edildi.");
                    }
        }








    }
}
