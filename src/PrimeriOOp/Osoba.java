package PrimeriOOp;

public class Osoba {

    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private char pol;

    Osoba(String ime, String prezime, int godinaRodjenja, char pol) {

        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.pol = pol;

    }

    public String getIme() {
        return ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public char getPol() {
        return pol;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public String toString() {
        return ime + prezime;
    }
}
