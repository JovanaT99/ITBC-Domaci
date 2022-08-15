import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Petlj {

    public static void main(String[] args) {

        int brojac = 0;
        boolean uslov = true;
        Scanner s = new Scanner(System.in);
        while (uslov) {

            System.out.println("Unesi Y/N");
            char ulaz = s.next().charAt(0);
            if (ulaz == 'Y') {
                brojac = brojac + 1;

            }
            if (ulaz == 'N') {
                break;
            }
        }
        System.out.println(brojac);


    }
}


