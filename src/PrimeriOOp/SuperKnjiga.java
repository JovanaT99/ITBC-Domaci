package PrimeriOOp;

class SuperKnjiga extends Knjiga {

    int IBN = 0;

    public int getIBN() {
        return IBN;
    }

    public void setIBN(int IBN) {
        this.IBN = IBN;
    }

    SuperKnjiga(String naslov, String autor, double ocena) {
        super(naslov, autor, ocena);
    }

    @Override
    public String toString() {

        return getAutor() + " " + getNaslov() + " " + getOcena() + " " + getIBN();
    }
}


