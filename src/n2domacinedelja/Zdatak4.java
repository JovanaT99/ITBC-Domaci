package n2domacinedelja;

import java.util.Arrays;

public class Zdatak4 {


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Ova funkcija sortira prosledjeni niz od min do max
    public static void selectionSort(int[] arr) {
// petlja iteria nesortirani niz
        for (int i = 0; i < arr.length - 1; i++) {
// definisemo promenljivu min koja sluzi kao referenca za minimalnu vrednost
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
// ako je vrednost elementa manja od vrednosti prethodnog elementa
                if (arr[j] < arr[min]) {
                    min = j; // u gore pomenutom slucaju definisemo novi min
                }
            }

            // Funkcija prima parametre, nesortirani niz,trenutnu minimalnu vrednost i  trenutni element.
            // Zamenjuje trenutni element nesortiranog niza sa trenutnom min vrednoscu.

            swap(arr, min, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 4, 1, 9, -2};
        selectionSort(arr);
// ispisuje sortiran niz od najmanjeg do najveceg broja. npr: [-2, 1, 3, 4, 5, 8, 9]
        System.out.println(Arrays.toString(arr));
    }
}

