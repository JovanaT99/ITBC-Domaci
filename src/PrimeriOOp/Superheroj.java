package PrimeriOOp;

public class Superheroj extends Person {
    static {
        System.out.println("SuperHeroj");
    }

    private String superMoc = "Letenje";
    private String superHerojIme = "Kul";

    Superheroj(String name, String surname, int birth, String zanimanje, String superMoc,String superHerojIme) {
        super(name, surname, birth, zanimanje);
        this.superMoc=superMoc;
        this.superHerojIme=superHerojIme;
    }


    public String getSuperMoc() {
        return superMoc;
    }

    public String getSuperHerojIme() {
        return superHerojIme;
    }


    public void setSuperMoc(String superMoc) {
        this.superMoc = superMoc;
    }

    public void setSuperHerojIme(String superHerojIme) {
        this.superHerojIme = superHerojIme;
    }

    @Override
    public String toString() {


        return getName() + getSurname() + getBirth() + getZanimanje() + getSuperHerojIme() + getSuperMoc();
    }
}
