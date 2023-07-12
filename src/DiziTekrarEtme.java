public class DiziTekrarEtme {
    static  boolean isFind(int[] tekrarlanan,int value){
        for (int i=0;i< tekrarlanan.length;i++){
            if(tekrarlanan[i]==value){
                return  true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] list={2,3,4,5,6,2,7,7,8,8};
        int[] tekrarlanan= new int[list.length];


        for(int i=0;i<list.length;i++){
            for (int j=i+1;j<list.length;j++){
                if(list[i]==list[j] && list[i]%2==0){
                   if(! isFind(tekrarlanan,list[i])){
                        tekrarlanan[i]=list[i];
                    }
                   break;
                }
            }
        }

        for (int value:tekrarlanan){
            if(value!=0){
                System.out.println(value);
            }
        }
    }
}
