package w3resource;
//49
public class Between {

    public static void main(String[] args) {
        System.out.println(between());

    }

    public static String between() {
        System.out.println("Deljivo sa 3");
        for (int i = 1; i <= 100; i++) {

            if (i %3 == 0)


                System.out.println(i);

        }
        System.out.println("Deljivo sa 5");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                System.out.println(i);


        }
        System.out.println("Deljivo sa 5 i sa 3");
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0 && i % 3 == 0)
                System.out.println(i);


        }
        return "";

    }

}