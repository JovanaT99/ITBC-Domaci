package w3resource;
//57
public class Divisible {

    public static void main(String[] args) {
        System.out.println(divisible());

    }

 public static int divisible(){

        int sum=0;
        for(int i=5; i<=20;i++){

            if(i%3==0){


                sum++;
            }
        }




        return sum;



 }
}
