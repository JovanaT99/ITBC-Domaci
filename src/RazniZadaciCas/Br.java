package RazniZadaciCas;

public class Br {

    public static void main(String[] args) {

        int w=3;
        int d=7;

        for(int i=1; i<=w; i++){

            System.out.println("Nedelja"+ i );

            for(int j=i; j<=d; j++ ){

                if(j!=2){
                    continue;
                }
                System.out.println("Dan" + j);
            }
        }





    }
    }

