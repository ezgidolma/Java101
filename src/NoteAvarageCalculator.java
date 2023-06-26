import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class NoteAvarageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Math note: ");
        int math= input.nextInt();

        System.out.println("Please enter Physical note: ");
        int physical= input.nextInt();

        System.out.println("Please enter Turkish note: ");
        int turkish= input.nextInt();

        System.out.println("Please enter History note: ");
        int history= input.nextInt();

        System.out.println("Please enter Music note: ");
        int music= input.nextInt();

        int avarage=(math+physical+turkish+history+music)/5;

        if(avarage>60){
            System.out.println("You pass the class.Congratulations.");
        }
        else {
            System.out.println("You didn't pass the class.Sorry.");
        }


    }
}