public class DiziHarmonik {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonik_s=0.0;
        for (int i = 1; i <= numbers.length; i++) {
            harmonik_s+=1.0/i;
        }
        double harmonik_ort=numbers.length/harmonik_s;

        System.out.println("Harmonik ortalama: "+harmonik_ort);
    }
}
