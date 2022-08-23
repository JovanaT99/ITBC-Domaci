package PrimeriOOp;

public class Knjiga {


    private String naslov;
    private String autor;
    private double ocena;


    Knjiga(String naslov, String autor, double ocena) {


        this.naslov = naslov;
        this.autor = autor;
        this.ocena = ocena;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public double getOcena() {
        return ocena;
    }


    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String toString() {


        return naslov + autor + ocena;
    }

}


