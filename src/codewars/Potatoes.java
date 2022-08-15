package codewars;

public class Potatoes {


    public static void main(String[] args) {

        int procenatVode = 99;
        int pocetnaTezina = 100;
        int konacnoVoda = 98;
        //potatoesKG(procenatVode, pocetnaTezina, konacnoVoda);
        System.out.println( potatoesKG(procenatVode, pocetnaTezina, konacnoVoda));
    }


    public static int potatoesKG(int voda, int tezina, int rerna) {


        //int sadrzajVode = tezina * voda / 100; //99kg -98
        //int suvoMat=tezina-sadrzajVode; //1kg
        //int ukupnopreRerne=sadrzajVode+suvoMat;
        int matter = tezina * (100 - voda);
        int bla =  matter / (100 - rerna);
        System.out.println(matter + " " + bla);
        return bla;





    }

}
