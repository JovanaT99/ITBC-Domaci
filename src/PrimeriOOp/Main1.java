package PrimeriOOp;

public class Main1 {


    public static void main(String[] args) {


        Knjiga knj=new Knjiga("Zenica Sveta","Robert Dzordan",9.7);
        System.out.println(knj.toString());
        Knjiga knj1=new Knjiga("Zenica Sveta","Robert Dzordan",9.7);
        System.out.println(knj1.toString());
        System.out.println(knj1.getOcena());
        SuperKnjiga sk = new SuperKnjiga("Blabla","NNN",9.9);
        sk.setIBN(2);
        System.out.println(sk.toString());



    }
}
