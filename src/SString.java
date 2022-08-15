import java.util.Scanner;

public class SString {

    //duzina Stringa
    //da li niska sadezi neki karakter
    public static void main(String[] args) {
        String s1 = "sjjjk";
        String s2 = "";
        // System.out.println(s1.length());
        Scanner s = new Scanner(System.in);
        //String email = "ajajj@gmail.com";
        String email = s.nextLine();
        //System.out.println(email.contains("@"));
        //System.out.println(email.indexOf("@"));
        /////////////////////////////////////
        boolean contains = false;//jos uvek ne znamo dal sadrzi
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {

                contains = true;
                break;
            }
        }
        System.out.println(contains);

        /////////////////////////////
///indexof
        int index = -1; //pozicija pronadjenog elementa

        String allIndexes = "";
        //AllIndexes+1=i+"";

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                index = i;
                break;
            }
        }
    }
}