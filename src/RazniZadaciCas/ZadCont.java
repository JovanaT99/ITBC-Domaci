package RazniZadaciCas;

import java.util.Scanner;

public class ZadCont {

        public static void main(String[] args) {
            Scanner st=new Scanner(System.in);

            String ime =st.nextLine();
            int brojac = 0;
            char c= st.next().charAt(0);
            for (int i = 0; i < ime.length(); i++) {

                char u = ime.charAt(i);
                if (u == c)
                    brojac++;
            }

            System.out.println("pojavluje se " + brojac);
        }
    }