package PrimeriOOp;

public class Main2 {

    public static void main(String[] args) {


        Person pr = new Person("Jovana", "Blagojevic", 1999, "Student");
        System.out.println(pr.toString());

        Superheroj sp = new Superheroj("bla", "Blaa", 78, "heroj","Leteti","Sup");
        System.out.println(sp.toString());


        Person s3=new Superheroj("Jovana", "Blagojevic", 1999, "Student", "nest", "nest");
        System.out.println(s3);




    }
}
