package w3resource;

//39
public class NumComb {


    public static void main(String[] args) {


        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println(i);
            for (int j = 1; j <= 4; j++) {
                System.out.println(j);
                for (int k = 1; k <= 4; k++) {
                    System.out.println(k);



                    if (k != i && k != j && i != j) {

                        sum++;

                    }


                }
            }


        }
        System.out.println(sum);
    }
}